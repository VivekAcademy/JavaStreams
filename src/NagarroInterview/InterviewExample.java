package NagarroInterview;

import java.util.Arrays;

public class InterviewExample {

	public InterviewExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		int[][] marks = { { 1, 2, 4, 3, 6 }, { 10, 2, 4, 3, 6 }, { 1, 11, 4, 3, 6 }

		};

		int n = marks.length; // Number of students
		int m = marks[0].length; // Number of subjects

		double[] averages = new double[m];

		for (int i = 0; i < m; i++) {
			int sum = 0;

			for (int j = 0; j < n; j++) {

				sum += marks[j][i];
			}

			averages[i] = sum / n;
		}
		System.out.println(Arrays.toString(averages));

		double minAverage = Double.MAX_VALUE;
		int minIndex = 0;
		for (int i = 0; i < m; i++) {
			if (averages[i] < minAverage) {
				minAverage = averages[i];
				minIndex = i;
			}

		}

		System.out.println("Min Average is " + minAverage + " on this index " + minIndex);

		int[][] updatedMarks = new int[n][m - 1];
		for (int u = 0; u < n; u++) {
			int k = 0;
			for (int v = 0; v < m; v++) {
				if (v != minIndex) {
					updatedMarks[u][k++] = marks[u][v];
				}
			}
		}
		int[] outputResults = new int[n];
		for(int i = 0 ; i<n ; i++) {
			int sum = 0 ;
			for(int j = 0 ; j<m-1 ; j++) {
				
				sum+=updatedMarks[i][j];
			}
			outputResults[i]=sum;
			
		}
		
		System.out.println("Resulted Output is " + Arrays.toString(outputResults));

	}

}
