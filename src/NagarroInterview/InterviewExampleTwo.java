package NagarroInterview;

import java.util.stream.Stream;

public class InterviewExampleTwo {

	public InterviewExampleTwo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Stream.iterate(new int[] {0,1}, f -> new int[] {f[1] , f[1]+f[0]})
				.limit(10)
				.map(f->f[0])
				.forEach(System.out::println);
		
	}

}
