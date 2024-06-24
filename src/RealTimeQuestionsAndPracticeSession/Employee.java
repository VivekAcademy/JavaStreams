package RealTimeQuestionsAndPracticeSession;

import java.util.Objects;

public class Employee {
   
    private int id;
    private int salary;
    private int age;
    
    
	public Employee(int id, int salary, int age) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"id=" + id +
				", salary=" + salary +
				", age=" + age +
				'}';
	}
}
