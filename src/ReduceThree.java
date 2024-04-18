import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceThree {

	public static void main(String[] args) {
		
		 List<Integer> listOfInteger = Arrays.asList(1,6,4,3,9,7,17,19,20);
		 Optional<Integer> sum =listOfInteger.stream()
				 .limit(3)
		.reduce(Integer::sum);
		 if(sum.isPresent()) {
			 System.out.println("Sum of the integers is " + sum.get());
		 }
		 
		 Optional<Integer> max =listOfInteger.stream()
				 .skip(1)
		.reduce(Integer::max);
		 if(max.isPresent()) {
			 System.out.println("Max Value  is " + max.get());
		 }
	}

}
