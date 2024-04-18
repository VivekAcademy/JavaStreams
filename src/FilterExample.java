import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class FilterExample {

	public static void main(String[] args) {

		List<Student> response =filterFemaleStudents();
		response.forEach(System.out::println);

	}

	/**
	 * @return 
	 * 
	 */
	private static List<Student> filterFemaleStudents() {
		Predicate<Student> func = t -> t.getGender().equalsIgnoreCase("female");
		return StudentDataBase.getAllStudents().stream().filter(func)
				.collect(Collectors.toList());
	}

}
