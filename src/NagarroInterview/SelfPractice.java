package NagarroInterview;

import java.util.Arrays;

public class SelfPractice {

    public static void main(String[] args){

        int[][] marks = { { 1, 2, 4, 3, 6 },
                          { 10, 2, 4, 3, 6 },
                          { 1, 11, 4, 3, 6 }
        };

        int n = marks.length; // Number of students
        int m = marks[0].length; // Number of subjects
        double[] average = new double[m];

        for(int j = 0 ; j<m ; j++){
            int sum = 0 ;
            for(int i = 0; i<n ; i++){

                sum+=marks[i][j];

            }
            average[j] = (double) sum /n ;

        }
        System.out.println(Arrays.toString(average));

        double minValue = Double.MAX_VALUE;
        int minIndex = 0 ;
        for(int i =0 ; i<m ; i++){
            if(average[i]<minValue) {
                minValue=average[i];
                minIndex=i;
            }
        }

        System.out.println("MIN VALUE IS " + minValue + " and index is " + minIndex);

        int[][] updatedMarks = new int[n][m-1];

        for(int i=0; i<n; i++){
            int k = 0 ;
            for(int j=0;j<m;j++){
                if(j!=minIndex){
                    updatedMarks[i][k++] = marks[i][j];
                }

            }

        }
        int[] outputResults = new int[n];
        for(int i = 0 ; i<n ; i++){
            int sum = 0 ;
            for(int j = 0 ; j<m-1 ; j++){

                sum+=updatedMarks[i][j];
            }
            outputResults[i]=sum;
        }

        System.out.println(Arrays.toString(outputResults));



    }


}
