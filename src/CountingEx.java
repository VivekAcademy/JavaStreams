import java.util.stream.Collectors;

import data.StudentDataBase;

public class CountingEx {

	public static void main(String[] args) {
		long countingOne = countingWithCount();
		System.out.println("Total Number of Students is " + countingOne);
		
		long countingTwo = countingWithCollectorsCounting();
		System.out.println("Total Number of Students is " + countingTwo);

	}

	/**
	 * @return
	 */
	private static long countingWithCount() {
		long countingOne = StudentDataBase.getAllStudents()
		.stream()
		.count();
		return countingOne;
	}
	
	/**
	 * @return
	 */
	private static long countingWithCollectorsCounting() {
		long countingOne = StudentDataBase.getAllStudents()
		.stream()
		.collect(Collectors.counting());
		return countingOne;
	}

}
