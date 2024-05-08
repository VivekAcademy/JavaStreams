package InterviewCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DecimalReverseOrder {

	public static void main(String[] args) {
		reverseDoubleValues();

		Map<String, Long> response = frequencyOfStrings();
		System.out.println(response);

		Map<Character, Long> values = findCharecterCounting();
		System.out.println(values);

		List<String> removeDuplicateResponse = removeduplicates();
		System.out.println(removeDuplicateResponse);

		Map<String, List<Integer>> answers = filterEvenAndOdd();
		System.out.println(answers);

		String joinResponse = joinStrings();
		System.out.println(joinResponse);

		List<Integer> multiResult = multiplyInteger();
		System.out.println(multiResult);

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		Optional<Integer> firstWay = findMaxFirstWay(listOfIntegers);
		System.out.println("1. MAX NUMBER ------------" + firstWay.get());

		OptionalInt secondWay = findMaxSecondWay(listOfIntegers);
		System.out.println("2. MAX NUMBER ------------" + secondWay.getAsInt());

		Optional<Integer> thirdWay = findMaxThirdWay(listOfIntegers);
		System.out.println("3. MAX NUMBER ------------" + thirdWay.get());

		Optional<Integer> minFindWay = findMinThirdWay(listOfIntegers);
		System.out.println("1. MIN NUMBER ------------" + minFindWay.get());

		findthreeMaximum();
		findthreeMinimum();

		int[] c = concatArrays();
		System.out.println(Arrays.toString(c));

		int[] output = concatArraysWithOutDuplicates();
		System.out.println(Arrays.toString(output));

		int[] outputReversedOrder = concatArraysReversedOrder();
		System.out.println(Arrays.toString(outputReversedOrder));

		printSecondLargest();

		String reverseString = reverseString();
		System.out.println(reverseString);

		sortedStringBasedOnLength();

		operationSumAndAvg();
		findCommonElements();

		String responseTwo = implReversedString();
		System.out.println(responseTwo);

	}

	private static String implReversedString() {
		String str = "Java Concept Of The Day";
		String responseTwo = Arrays.stream(str.split(" ")).map(word -> new StringBuffer(word).reverse().toString())
				.collect(Collectors.joining(" "));
		return responseTwo;
	}

	private static void findCommonElements() {
		List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

		List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

		list1.stream().filter(list2::contains).forEach(System.out::println);
	}

	private static void operationSumAndAvg() {
		int[] a = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };

		int resultsSum = Arrays.stream(a).sum();

		double average = Arrays.stream(a).average().getAsDouble();
		System.out.println("SUM " + resultsSum);
		System.out.println("AVERAGE " + average);
	}

	private static void sortedStringBasedOnLength() {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
		listOfStrings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}

	private static String reverseString() {
		StringBuilder name = new StringBuilder("vivek");
		String reverseString = name.reverse().toString();
		return reverseString;
	}

	private static void printSecondLargest() {
		List<Integer> listOfInputValues = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		listOfInputValues.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
	}

	private static int[] concatArrays() {
		int[] a = new int[] { 4, 2, 7, 1 };

		int[] b = new int[] { 8, 3, 9, 5 };

		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
		return c;
	}

	private static int[] concatArraysReversedOrder() {
		int[] a = new int[] { 4, 2, 7, 1 };

		int[] b = new int[] { 8, 3, 9, 5 };

		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).boxed().sorted(Comparator.reverseOrder())
				.mapToInt(Integer::intValue).toArray();
		return c;
	}

	private static int[] concatArraysWithOutDuplicates() {
		int[] a = new int[] { 4, 2, 5, 1 };

		int[] b = new int[] { 8, 1, 9, 5 };

		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).distinct().sorted().toArray();
		return c;
	}

	private static void findthreeMaximum() {
		List<Integer> listOfIntegersValues = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		System.out.println("Three Maximum Numbers are ");
		listOfIntegersValues.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
	}

	private static void findthreeMinimum() {
		List<Integer> listOfIntegersValues = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		System.out.println("Three Minimum Numbers are ");
		listOfIntegersValues.stream().sorted().limit(3).forEach(System.out::println);
	}

	private static Optional<Integer> findMaxThirdWay(List<Integer> listOfIntegers) {
		Optional<Integer> thirdWay = listOfIntegers.stream().collect(Collectors.maxBy(Comparator.comparing(t -> t)));
		return thirdWay;
	}

	private static Optional<Integer> findMinThirdWay(List<Integer> listOfIntegers) {
		Optional<Integer> thirdWay = listOfIntegers.stream().collect(Collectors.minBy(Comparator.comparing(t -> t)));
		return thirdWay;
	}

	private static OptionalInt findMaxSecondWay(List<Integer> listOfIntegers) {
		OptionalInt secondWay = listOfIntegers.stream().mapToInt(Integer::intValue).max();
		return secondWay;
	}

	private static Optional<Integer> findMaxFirstWay(List<Integer> listOfIntegers) {
		Optional<Integer> firstWay = listOfIntegers.stream().reduce(Integer::max);
		return firstWay;
	}

	private static List<Integer> multiplyInteger() {
		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
		List<Integer> multiResult = listOfIntegers.stream().filter(t -> t % 5 == 0).collect(Collectors.toList());
		return multiResult;
	}

	/**
	 * @return
	 */
	private static String joinStrings() {
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String joinResponse = listOfStrings.stream().collect(Collectors.joining(",", "[", "]"));
		return joinResponse;
	}

	/**
	 * @return
	 */
	private static Map<String, List<Integer>> filterEvenAndOdd() {
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Map<String, List<Integer>> answers = listOfIntegers.stream()
				.collect(Collectors.groupingBy(t -> t % 2 == 0 ? "SUM NUMBERS" : "ODD NUMBERS"));
		return answers;
	}

	/**
	 * @return
	 * 
	 */
	private static List<String> removeduplicates() {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		List<String> response = listOfStrings.stream().distinct().collect(Collectors.toList());
		return response;
	}

	/**
	 * @return
	 */
	private static Map<Character, Long> findCharecterCounting() {
		String inputString = "Java Concept Of The Day";
		Map<Character, Long> values = inputString.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(t -> t, Collectors.counting()));
		return values;
	}

	/**
	 * @return
	 */
	private static Map<String, Long> frequencyOfStrings() {
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");
		Map<String, Long> response = stationeryList.stream()
				.collect(Collectors.groupingBy(t -> t, Collectors.counting()));
		return response;
	}

	/**
	 * 
	 */
	private static void reverseDoubleValues() {
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		decimalList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	}

}
