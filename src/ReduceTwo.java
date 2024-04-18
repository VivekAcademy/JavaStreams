import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class ReduceTwo {

	public static void main(String[] args) {
		
		Optional<Integer> output =totalNotebooks();
		if(output.isPresent()) {
			System.out.println("Total Books " + output.get() );
		}
		
		Optional<Integer> outputAdvanced =totalNotebooksWithAdvanced();
		if(outputAdvanced.isPresent()) {
			System.out.println("Total Books " + output.get() );
		}
		

	}

	/**
	 * @return 
	 * 
	 */
	private static Optional<Integer> totalNotebooks() {
		Optional<Integer> totalNumberOfNotebooks=StudentDataBase.getAllStudents().stream()
		.map(Student::getNotebooks)
		.reduce((a,b) -> a+b);
		return totalNumberOfNotebooks;
	}
	
	private static Optional<Integer> totalNotebooksWithAdvanced() {
		Optional<Integer> totalNumberOfNotebooks=StudentDataBase.getAllStudents().stream()
		.map(Student::getNotebooks)
		.reduce(Integer::sum);
		return totalNumberOfNotebooks;
	}

}
