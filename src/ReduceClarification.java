import java.util.Optional;

import data.Student;
import data.StudentDataBase;

public class ReduceClarification {

	public static void main(String[] args) {
		Optional<Student> responseWithoutIdentity=findHighestGradeLevelStudent();
		if(responseWithoutIdentity.isPresent()) {
			System.out.println(responseWithoutIdentity.get());
		}
		
		Optional<Student> responseWithoutIdentityOne=findHighestGPAStudent();
		if(responseWithoutIdentityOne.isPresent()) {
			System.out.println(responseWithoutIdentityOne.get());
		}

	}

	/**
	 * @return 
	 * 
	 */
	private static Optional<Student> findHighestGradeLevelStudent() {
		Optional<Student> response =StudentDataBase.getAllStudents().stream()
		.reduce((a,b) -> a.getGradeLevel()>b.getGradeLevel() ? a : b);
		return response;
	}
	
	private static Optional<Student> findHighestGPAStudent() {
		Optional<Student> response =StudentDataBase.getAllStudents().stream()
		.reduce((a,b) -> a.getGpa()>b.getGpa() ? a : b);
		return response;
	}
	

}
