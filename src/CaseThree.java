import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import data.Student;
import data.StudentDataBase;

public class CaseThree {

	public static void main(String[] args) {

		// Function<Student, String> f1 = t1 ->t1.getName();
		// Function<Student, List<String>> f2 = t2 ->t2.getActivities();

		List<Student> listOfStudent = StudentDataBase.getAllStudents();
		Map<String, List<String>> output = listOfStudent.stream()
				.peek(t->System.out.println("First Filter-------" +  t))
				.filter(t-> t.getGradeLevel()>3)
				.peek(t->System.out.println("Second Filter-------" +  t))
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(output);

	}

}
