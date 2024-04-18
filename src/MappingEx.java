import java.util.List;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class MappingEx {

	public static void main(String[] args) {
		System.out.println("Names List With Map Intermediate " + findNameListOne());
		System.out.println("Names List Without Intermediate" + findNameListTwo());

	}

	/**
	 * @return 
	 * 
	 */
	private static List<String> findNameListOne() {
		List<String> namesListWithIntermediate =StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getName)
		.collect(Collectors.toList());
		return namesListWithIntermediate;
	}
	
	/**
	 * @return 
	 * 
	 */
	private static List<String> findNameListTwo() {
		List<String> namesListWithOutIntermediate =StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.mapping(Student::getName, Collectors.toList()));
		return namesListWithOutIntermediate;
	}

}
