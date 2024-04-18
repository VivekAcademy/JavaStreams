import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class JoiningEx {

	public static void main(String[] args) {
		
		String response = simpleJoinOne();
		System.out.println(response);
		
		String responseTwo = simpleJoinTwo();
		System.out.println(responseTwo);
		
		String responseThree = simpleJoinThree();
		System.out.println(responseThree);
		

	}

	/**
	 * @return
	 */
	private static String simpleJoinOne() {
		String response = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
		.collect(Collectors.joining());
		return response;
	}
	
	private static String simpleJoinTwo() {
		String response = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
		.collect(Collectors.joining("-"));
		return response;
	}
	
	private static String simpleJoinThree() {
		String response = StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
		.collect(Collectors.joining("-", "{", "}"));
		return response;
	}

}
