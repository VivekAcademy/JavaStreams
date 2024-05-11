package Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeImpl {

	public static void main(String[] args) {
		List<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(1, "Amanda", 25000, "IT"));

		al.add(new Employee(2, "Berlin", 35000, "HR"));

		al.add(new Employee(3, "Caroline", 40000, "IT"));

		al.add(new Employee(4, "Damodar", 30000, "HR"));

		Integer SecondHighestSalary = al.stream().map(Employee::getSalary).sorted(Comparator.reverseOrder()).skip(1)
				.findFirst().get();
		System.out.println("Second Highest Salary is " + SecondHighestSalary);

		Optional<Employee> SecondHighestSalaryEmployee = al.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
		System.out.println("Second Highest Salary Employee Name is " + SecondHighestSalaryEmployee.get().getName());

		Map<String, Integer> response = al.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
				.limit(1).collect(Collectors.toMap(Employee::getName, Employee::getSalary));
		System.out.println(response);

	}

}
