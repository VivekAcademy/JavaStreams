import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class GroupingEx {

	public static void main(String[] args) {

		Map<String, List<Student>> valueMapOne = groupingByGenderWholeStudent();
		System.out.println(valueMapOne);

		Map<String, List<String>> valueMapTwo = groupingByGenderOnlyStudentName();
		System.out.println(valueMapTwo);

		Map<String, List<String>> valueMapThree = groupingByGPAOnlyStudentNameCustom();
		System.out.println(valueMapThree);

		Map<String, Integer> valueMapFour = groupingByNameWithNumberOfNotebooks();
		System.out.println(valueMapFour);
		
		Map<Integer, Optional<Student>> valueMapFive = groupingByGradeLevel();
		System.out.println(valueMapFive);
		
		Map<Integer,Student> valueMapSix = groupingByGradeLevelUsingCollectingAndThen();
		System.out.println(valueMapSix);

	}

	/**
	 * @return
	 */
	private static Map<String, List<Student>> groupingByGenderWholeStudent() {
		Map<String, List<Student>> valueMapOne = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		return valueMapOne;
	}

	/**
	 * @return
	 */
	private static Map<String, List<String>> groupingByGenderOnlyStudentName() {
		Map<String, List<String>> valueMapTwo = StudentDataBase.getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getGender, Collectors.mapping(Student::getName, Collectors.toList())));
		return valueMapTwo;
	}

	/**
	 * @return
	 */
	private static Map<String, List<String>> groupingByGPAOnlyStudentNameCustom() {
		Map<String, List<String>> valueMapTwo = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(t -> t.getGpa() >= 3.8 ? "EXCELLENT" : "GOOD",
						Collectors.mapping(Student::getName, Collectors.toList())));
		return valueMapTwo;
	}

	/**
	 * @return
	 */
	private static Map<String, Integer> groupingByNameWithNumberOfNotebooks() {
		Map<String, Integer> valueMapFour = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName, Collectors.summingInt(Student::getNotebooks)));
		return valueMapFour;
	}
	
	
	/**
	 * @return
	 */
	private static Map<Integer, Optional<Student>> groupingByGradeLevel() {
		Map<Integer, Optional<Student>> valueMapFour = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		return valueMapFour;
	}
	

	/**
	 * @return
	 */
	private static Map<Integer, Student> groupingByGradeLevelUsingCollectingAndThen() {
		Map<Integer,Student> valueMapFour = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)));
		return valueMapFour;
	}

}
