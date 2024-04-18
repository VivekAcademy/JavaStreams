import java.util.stream.Stream;

public class StreamFactory {

	public static void main(String[] args) {
		
		
		Stream<String> customStream = Stream.of("Vivek", "Ayush", "Aashvi");
		customStream.forEach(System.out::println);
		
		
		 Stream.iterate(1, x->x*2)
				.limit(10)
				.forEach(System.out::println);
				
		

	}

}
