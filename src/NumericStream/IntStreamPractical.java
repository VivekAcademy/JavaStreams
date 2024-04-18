package NumericStream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class IntStreamPractical {

	public static void main(String[] args) {

		Optional<Integer> response = sumWithWrapper();
		System.out.println(response.isPresent() ? response.get() : 0);

		System.out.println("Sum With Intstream --" + sumWithIntStream());

		System.out.println("Sum With Longstream --" + sumWithLongStream());

		System.out.println("Sum With Doublestream --" + sumWithDoubleStream());

		System.out.println("Average with Double Stream" + avgWithLongStream());

		System.out.println("Unboxing response of Sum " + unBoxing());

		System.out.println("Boxing response of Sum " + boxing());

		System.out.println("Boxing Other Way response of Sum " + boxingInOtherWay());

		System.out.println("Map to Double Implementation " + mapToDoubleImpl());

	}

	/**
	 * @return
	 */
	private static Optional<Integer> sumWithWrapper() {
		List<Integer> listOfValues = Arrays.asList(1, 2, 3, 4, 5, 6);
		Optional<Integer> response = listOfValues.stream().reduce(Integer::sum);
		return response;
	}

	/**
	 * @return
	 */
	private static int sumWithIntStream() {
		int response = IntStream.rangeClosed(1, 6).sum();
		return response;
	}

	/**
	 * @return
	 */
	private static long sumWithLongStream() {
		long response = LongStream.rangeClosed(1, 6).sum();
		return response;
	}

	private static double sumWithDoubleStream() {
		double response = LongStream.rangeClosed(1, 6).asDoubleStream().sum();
		return response;
	}

	private static double avgWithLongStream() {
		OptionalDouble response = LongStream.rangeClosed(1, 6).average();
		return response.isPresent() ? response.getAsDouble() : 0.0;
	}

	private static int unBoxing() {
		List<Integer> listOfValues = Arrays.asList(1, 2, 3, 4, 5, 6);
		int response = listOfValues.stream().mapToInt(Integer::intValue).sum();
		return response;
	}

	private static List<Integer> boxing() {
		List<Integer> response = IntStream.rangeClosed(1, 6).boxed().collect(Collectors.toList());
		return response;
	}

	private static List<Integer> boxingInOtherWay() {
		List<Integer> response = IntStream.rangeClosed(1, 6).mapToObj(t -> Integer.valueOf(t))
				.collect(Collectors.toList());
		return response;
	}

	private static double mapToDoubleImpl() {
		double response = IntStream.rangeClosed(1, 6).mapToDouble(t -> t).sum();
		return response;
	}

}
