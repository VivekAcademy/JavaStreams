import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CaseTwo {

	public static void main(String[] args) {
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		/*
		listOfIntegers.stream()
		.filter(t->t%2==0)
		.forEach(i->System.out.println(i));
		*/
		
		Map<Boolean, List<Integer>> values = listOfIntegers.stream().collect(Collectors.partitioningBy(t->t%2==0));
		
		for(Map.Entry<Boolean, List<Integer>> oneValue : values.entrySet()) {
			
			if(oneValue.getKey()) {
				System.out.println("Even Numbers - ");
				
			}
			else {
				System.out.println("Odd Numbers -");
			}
			
			for(int i : oneValue.getValue()) {
				
				System.out.println(i);
			}
			
			
		}
		
		System.out.println("Another Method");
		System.out.println(sumCalculations());
	}
	
	private static Map<String, List<Integer>> sumCalculations() {
		List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Map<String, List<Integer>> values =listOfIntegers.stream()
		.collect(Collectors.groupingBy(t->t%2==0 ? "SUM NUMBERS" : "ODD NUMBERS"));
		System.out.println(listOfIntegers);
		return values;
		
	}

}
