import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class CaseOne {

	public static void main(String[] args) {
		
		List<Integer> listOfInteger = Arrays.asList(1,6,4,3,9,7,17,19,20);
		listOfInteger.forEach(i->System.out.println(i));
		Optional<Integer> values = listOfInteger.stream()
				.filter(t-> t%2==1)
				.sorted()
				.map(t -> t*2)
				.reduce((t, u) -> t+u);
		
		System.out.println(values.isPresent() ? values.get() : null);
		
		
		Integer valuesOne = listOfInteger.stream()
				.filter(t-> t%2==1)
				.sorted()
				.map(t -> t*2)
				.collect(Collectors.summingInt(t->t));
		
		System.out.println("Sum of Integer is " + valuesOne);
		
		List<Integer> reverseResponse=listOfInteger.stream()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList());
		System.out.println(reverseResponse);

	}

}
