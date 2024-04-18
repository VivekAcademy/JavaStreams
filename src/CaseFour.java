import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class CaseFour {

	public static void main(String[] args) {

		List<String> response=namesList();
		System.out.println(response);
		Set<String> responseTwo = namesSet();
		System.out.println(responseTwo);

	}

	/**
	 * @return 
	 * 
	 */
	private static List<String> namesList() {
		//Function<Student, String> customFunc = t -> t.getName();
		Function<Student, String> customFuncForMethodRef = Student::getName;
		Function<String, String> operationTwo = String::toUpperCase;
		
		List<String> response = StudentDataBase.getAllStudents().stream().map(customFuncForMethodRef)
				.map(operationTwo)
				.collect(Collectors.toList());
		return response;
	}
	
	/**
	 * @return 
	 * 
	 */
	private static Set<String> namesSet() {
		//Function<Student, String> customFunc = t -> t.getName();
		Function<Student, String> customFuncForMethodRef = Student::getName;
		Function<String, String> operationTwo = String::toUpperCase;
		
		Set<String> response = StudentDataBase.getAllStudents().stream().map(customFuncForMethodRef)
				.map(operationTwo)
				.collect(Collectors.toSet());
		return response;
	}

}
