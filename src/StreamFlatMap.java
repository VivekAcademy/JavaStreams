import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class StreamFlatMap {

	public static void main(String[] args) {
		
		Set<String> response = setTheListOfActivities();
		System.out.println(response);
		List<String> responseOne = listTheListOfActivities();
		System.out.println(responseOne);
		System.out.println("Number Of Elements in Stream ---" + countNumberOfElements());

	}

	/**
	 * @return
	 */
	private static Set<String> setTheListOfActivities() {
		Set<String> response = StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.collect(Collectors.toSet());
		return response;
	}
	
	/**
	 * @return
	 */
	private static List<String> listTheListOfActivities() {
		List<String> response = StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.collect(Collectors.toList());
		return response;
	}
	
	private static Long countNumberOfElements() {
		long count = StudentDataBase.getAllStudents()
		.stream()
		.map(Student::getActivities)
		.flatMap(List::stream)
		.distinct()
		.count();	
		return count;	
	}

}
