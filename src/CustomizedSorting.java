import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class CustomizedSorting {

	public static void main(String[] args) {
		List<Student> reponseOne=sortBasedOnName();
		System.out.println("Sorted Based On Name--------");
		reponseOne.forEach(System.out::println);
		
		List<Student> reponseTwo=sortBasedOnGPA();
		System.out.println("Sorted Based On GPA--------");
		reponseTwo.forEach(System.out::println);
		
		List<Student> reponseThree=sortBasedOnGPADesc();
		System.out.println("Sorted Based On GPA Reversed --------");
		reponseThree.forEach(System.out::println);
		

	}

	/**
	 * @return 
	 * 
	 */
	private static List<Student> sortBasedOnName() {
		List<Student> response = StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
		return response;
	}
	
	/**
	 * @return 
	 * 
	 */
	private static List<Student> sortBasedOnGPA() {
		List<Student> response = StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa))
		.collect(Collectors.toList());
		return response;
	}
	
	/**
	 * @return 
	 * 
	 */
	private static List<Student> sortBasedOnGPADesc() {
		List<Student> response = StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getGpa).reversed())
		.collect(Collectors.toList());
		return response;
	}

}
