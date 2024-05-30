package NagarroInterview;

import java.util.Arrays;

public class NagarroPracticePaper {

    public static void main(String[] args){

        int[][] marks = { { 1, 2, 4, 3, 6 },
                { 10, 2, 4, 3, 6 },
                { 1, 11, 4, 3, 6 }
        };

        int noOfStudent = marks.length;
        System.out.println("Number of Students Are " + noOfStudent);

        int noOfSubject = marks[0].length;
        System.out.println("Number of Subject Are " + noOfSubject);

        double[] avgDetails = new double[noOfSubject] ;


        for (int i=0 ; i<noOfSubject; i++){
            int sum =0;
            for(int j=0; j<noOfStudent; j++){
                sum+=marks[j][i];
            }
            avgDetails[i]=sum/noOfStudent;
        }

        System.out.println("Details Are " + Arrays.toString(avgDetails));
        double minValue = Double.MAX_VALUE;
        int minIndex = 0 ;
        for(int i = 0; i<noOfSubject ; i++){

            if(avgDetails[i]<minValue){

                minValue=avgDetails[i];
                minIndex = i ;

            }

        }
        System.out.println("Min Index is " + minIndex + " Value is " + minValue);

        int[][] updatedMarks = new int[noOfStudent][noOfSubject-1];
        for(int i = 0 ; i < noOfStudent ; i++){
            int k = 0 ;
            for(int j=0 ; j<noOfSubject ; j++){
                if(j != minIndex) {
                    updatedMarks[i][k++] = marks[i][j];
                }

            }
        }
        int[] result = new int[noOfStudent];
        for (int i = 0 ; i<noOfStudent; i++){
            int sum = 0 ;
            for(int j=0 ; j<noOfSubject-1; j++){
                sum+=updatedMarks[i][j];

            }
            result[i]=sum;


        }

        System.out.println("Result is " + Arrays.toString(result));



    }

}
