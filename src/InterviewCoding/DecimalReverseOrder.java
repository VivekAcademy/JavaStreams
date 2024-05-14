package InterviewCoding;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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

		int[] reversedArray = reversedArray();
		System.out.println("Reversed Array Are :- " + Arrays.toString(reversedArray));

		int sumOfDigits = sumOfDigits();
		System.out.println("Sum of digits is " + sumOfDigits);
		boolean valuesForAnagrams = anagramsStrings();
		System.out.println("Strings are Anagrams :- " + valuesForAnagrams);

		Map<String, Long> dem = findCharacterCountingSecondWay();
		System.out.println("================" + dem);

		findIfPalindromeStringsOrNot();

		List<String> findStringsStartsWithNum = findStringsStartWithNumeric();
		System.out.println(findStringsStartsWithNum);

		List<Integer> outputList = findRepetitveElements();
		System.out.println(outputList);

		Set<String> resultOutput = findCharacterRepetition();
		System.out.println(resultOutput);

		String results = findFirstRepeatedCharectar();
		System.out.println("First Repeated Charectar is " + results);

		String resultsOne = findFirstNonRepeatedCharectar();
		System.out.println("First Non Repeated Charectar is " + resultsOne);

		Optional<Entry<String, Long>> resultsMain = findMostRepetiveString();
		if (resultsMain.isPresent()) {
			System.out.println(resultsMain.get());
		}

		String responseLastElement = findLastElement();
		System.out.println(responseLastElement);

		List<Integer> fabboniciNumber = findFibonacciSeries();
		System.out.println("Fabonicci Number are " + fabboniciNumber);

		List<Integer> oddNumber = findFirstTenOddNumbers();
		System.out.println("First Ten Odd Numbers Are :- " + oddNumber);
		
		long MyAgeInYear = myAgeInYears();
		System.out.println("My AGE IS " + MyAgeInYear);

	}

	private static long myAgeInYears() {
		LocalDate birthDay = LocalDate.of(1991, 12, 20);
		LocalDate currentDate = LocalDate.now();
		System.out.println("Current Date is " + currentDate);
		long MyAgeInYear = ChronoUnit.YEARS.between(birthDay, currentDate);
		return MyAgeInYear;
	}

	private static List<Integer> findFirstTenOddNumbers() {
		List<Integer> oddNumber = Stream.iterate(new int[] { 1, 3 }, i -> new int[] { i[1], 2 + i[1] }).limit(10)
				.map(i -> i[0]).collect(Collectors.toList());
		return oddNumber;
	}

	private static List<Integer> findFibonacciSeries() {
		List<Integer> fabboniciNumber = Stream.iterate(new int[] { 0, 1 }, i -> new int[] { i[1], i[0] + i[1] })
				.limit(10).map(i -> i[0]).collect(Collectors.toList());
		return fabboniciNumber;
	}

	private static String findLastElement() {
		List<String> listOfStrings = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six", "Nine");
		String responseLastElement = IntStream.rangeClosed(1, listOfStrings.size()).boxed()
				.map(t -> listOfStrings.get(listOfStrings.size() - t)).findFirst().get();
		return responseLastElement;
	}

	private static Optional<Entry<String, Long>> findMostRepetiveString() {
		List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
				"Pencil");
		Map<String, Long> responseOne = listOfStrings.stream()
				.collect(Collectors.groupingBy(t -> t, LinkedHashMap::new, Collectors.counting()));
		Optional<Entry<String, Long>> resultsMain = responseOne.entrySet().stream()
				.collect(Collectors.maxBy(Comparator.comparing(t -> t.getValue())));
		return resultsMain;
	}

	private static String findFirstRepeatedCharectar() {
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		Set<String> hashSet = new HashSet<>();
		String results = Arrays.stream(inputString.split("")).filter(i -> !hashSet.add(i)).findFirst().get();
		return results;
	}

	private static String findFirstNonRepeatedCharectar() {
		String inputString = "java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		Map<String, Long> resultsOne = Arrays.stream(inputString.split(""))
				.collect(Collectors.groupingBy(t -> t, LinkedHashMap::new, Collectors.counting()));

		return resultsOne.entrySet().stream().filter(i -> i.getValue() == 1).map(t -> t.getKey()).findFirst().get();

	}

	private static Set<String> findCharacterRepetition() {
		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
		Set<String> hashSet = new HashSet<>();
		Set<String> resultOutput = Arrays.stream(inputString.split("")).filter(i -> !hashSet.add(i))
				.collect(Collectors.toSet());
		return resultOutput;
	}

	private static List<Integer> findRepetitveElements() {
		List<Integer> listOfIntegersOne = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
		Set<Integer> hashSet = new HashSet<>();
		List<Integer> outputList = listOfIntegersOne.stream().filter(i -> !hashSet.add(i)).collect(Collectors.toList());
		return outputList;
	}

	private static List<String> findStringsStartWithNumeric() {
		List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
		List<String> findStringsStartsWithNum = listOfStrings.stream().filter(t -> Character.isDigit(t.charAt(0)))
				.collect(Collectors.toList());
		return findStringsStartsWithNum;
	}

	private static void findIfPalindromeStringsOrNot() {
		String str = "ROTATOR";
		boolean results = IntStream.rangeClosed(0, str.length() / 2)
				.noneMatch(i -> str.charAt(i) != str.charAt(str.length() - 1 - i));
		if (results) {
			System.out.println(str + " String is palindrome");
		} else {

			System.out.println("String is not Palindrome");
		}
	}

	private static Map<String, Long> findCharacterCountingSecondWay() {
		String str = "Java Concept Of The Day";
		Map<String, Long> dem = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(t -> t, Collectors.counting()));
		return dem;
	}

	private static int sumOfDigits() {
		int i = 15623;
		int sumOfDigits = Arrays.stream(String.valueOf(i).split("")).map(Integer::parseInt)
				.collect(Collectors.summingInt(t -> t));
		return sumOfDigits;
	}

	private static boolean anagramsStrings() {
		String s1 = "RaceCar";
		String s2 = "CarRace";

		String s1Anagrams = Arrays.stream(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		String s2Anagrams = Arrays.stream(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		return s1Anagrams.equalsIgnoreCase(s2Anagrams);
	}

	private static int[] reversedArray() {
		int[] array = new int[] { 5, 1, 7, 3, 9, 6 };

		int[] reversedArray = IntStream.rangeClosed(1, array.length).map(t -> array[array.length - t]).toArray();
		return reversedArray;
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
