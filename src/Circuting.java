import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class Circuting {

	public static void main(String[] args) {

		Boolean response = StudentDataBase.getAllStudents().stream().anyMatch(t -> t.getGradeLevel() >= 4);

		System.out.println(response);

		Optional<Student> student = StudentDataBase.getAllStudents().stream().findFirst();
		if (student.isPresent()) {
			System.out.println(student.get());

		}

	}

}
