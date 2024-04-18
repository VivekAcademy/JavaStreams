import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import data.Student;
import data.StudentDataBase;

public class MaxMinAvgSumWithWrapper {

	public static void main(String[] args) {

		Optional<Student> leastGPAStudent = findLeastGpaStudentWithReduce();
		System.out.println("Least GPA Student is ");
		System.out.println(leastGPAStudent.isPresent() ? leastGPAStudent.get() : "Not Present");

		Optional<Student> MaxGPAStudent = findMaxGpaStudentWithReduce();
		System.out.println("Max GPA Student is ");
		System.out.println(MaxGPAStudent.isPresent() ? MaxGPAStudent.get() : "Not Present");

		Optional<Integer> totalNotebooks = findTotalNotebooksWithReduce();
		System.out.println("Total Notebooks is ");
		System.out.println(totalNotebooks.isPresent() ? totalNotebooks.get() : "Not Present");

		Optional<Student> leastGPAStudentOne = findLeastGpaStudentWithOutReduce();
		System.out.println("With out Reduce Least GPA Student is ");
		System.out.println(leastGPAStudentOne.isPresent() ? leastGPAStudentOne.get() : "Not Present");

		Optional<Student> MaxGPAStudentOne = findMaxGpaStudentWithOutReduce();
		System.out.println("With out Reduce Max GPA Student is ");
		System.out.println(MaxGPAStudentOne.isPresent() ? MaxGPAStudentOne.get() : "Not Present");

		Optional<Integer> maxBetweenIntegers = maxBetweenIntegers();
		System.out.println("Max  is ");
		System.out.println(maxBetweenIntegers.isPresent() ? maxBetweenIntegers.get() : "Not Present");

		System.out.println("Total Number of Notebooks Without Reduce " + findTotalNotebooksWithOutReduce());
		System.out.println("Averaging Notebooks are " + findAvgNotebooks());

	}

	/**
	 * @return
	 * 
	 */
	private static Optional<Student> findLeastGpaStudentWithReduce() {
		Optional<Student> minGpaStudent = StudentDataBase.getAllStudents().stream()
				.reduce((a, b) -> a.getGpa() >= b.getGpa() ? b : a);
		return minGpaStudent;
	}

	private static Optional<Student> findMaxGpaStudentWithReduce() {
		Optional<Student> maxGpaStudent = StudentDataBase.getAllStudents().stream()
				.reduce((a, b) -> a.getGpa() >= b.getGpa() ? a : b);
		return maxGpaStudent;
	}

	private static Optional<Integer> findTotalNotebooksWithReduce() {
		Optional<Integer> totalNotebooks = StudentDataBase.getAllStudents().stream().map(Student::getNotebooks)
				.reduce(Integer::sum);
		return totalNotebooks;
	}

	/**
	 * @return
	 * 
	 */
	private static Optional<Student> findLeastGpaStudentWithOutReduce() {
		Optional<Student> minGpaStudent = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
		return minGpaStudent;
	}

	/**
	 * @return
	 * 
	 */
	private static Optional<Student> findMaxGpaStudentWithOutReduce() {
		Optional<Student> maxGpaStudent = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
		return maxGpaStudent;
	}

	private static Optional<Integer> maxBetweenIntegers() {
		Optional<Integer> maxGpaStudent = IntStream.rangeClosed(1, 5).mapToObj(i -> Integer.valueOf(i))
				.collect(Collectors.maxBy(Comparator.comparing(t -> t)));

		return maxGpaStudent;
	}

	private static Integer findTotalNotebooksWithOutReduce() {
		Integer totalNotebooks = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.summingInt(Student::getNotebooks));
		return totalNotebooks;
	}

	private static Double findAvgNotebooks() {
		Double totalNotebooks = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.averagingInt(Student::getNotebooks));
		return totalNotebooks;
	}

}
