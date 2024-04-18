package InterviewCoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DecimalReverseOrder {

	public static void main(String[] args) {
		reverseDoubleValues();

		Map<String, Long> response = frequencyOfStrings();
		System.out.println(response);

		Map<Character, Long> values = findCharecterCounting();
		System.out.println(values);
		
		List<String> removeDuplicateResponse=removeduplicates();
		System.out.println(removeDuplicateResponse);
		
		Map<String, List<Integer>> answers = filterEvenAndOdd();
		System.out.println(answers);
		
		String joinResponse = joinStrings();
		System.out.println(joinResponse);
	}

	/**
	 * @return
	 */
	private static String joinStrings() {
		List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
		String joinResponse = listOfStrings.stream()
		.collect(Collectors.joining(",", "[", "]"));
		return joinResponse;
	}

	/**
	 * @return
	 */
	private static Map<String, List<Integer>> filterEvenAndOdd() {
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Map<String, List<Integer>> answers = listOfIntegers.stream()
		.collect(Collectors.groupingBy(t->t%2==0 ? "SUM NUMBERS" : "ODD NUMBERS"));
		return answers;
	}

	/**
	 * @return 
	 * 
	 */
	private static List<String> removeduplicates() {
		List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
		List<String> response =listOfStrings.stream()
		.distinct()
		.collect(Collectors.toList());
		return response;
	}

	/**
	 * @return
	 */
	private static Map<Character, Long> findCharecterCounting() {
		String inputString = "Java Concept Of The Day";
		 Map<Character, Long> values=inputString.chars()
		 .mapToObj(c -> (char) c)
		 .collect(Collectors.groupingBy(t->t, Collectors.counting()));
		return values;
	}

	/**
	 * @return
	 */
	private static Map<String, Long> frequencyOfStrings() {
		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
		Map<String, Long> response =  stationeryList.stream()
		 .collect(Collectors.groupingBy(t->t, Collectors.counting()));
		return response;
	}

	/**
	 * 
	 */
	private static void reverseDoubleValues() {
		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		decimalList.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}

}
