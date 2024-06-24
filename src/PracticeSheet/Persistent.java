package PracticeSheet;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Persistent {

    public static void main(String[] args){
        int[] arr = new int[]{45,65,35,12,98,67,45,90,78,21};
        Optional<Integer> value= Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        if (value.isPresent()){
            System.out.println(value.get());
        }

        System.out.println("Hello LeetCoder");

        // Second

        int[] arrOne = new int[]{56,45,87,40,30,50,80};
        for (int i=0 ; i<arrOne.length ;i++){
            for(int j = i+1; j<arrOne.length ;j++){
                if(arrOne[i]+arrOne[j]==80){

                    System.out.println("Element is " + arrOne[i] + " and " +arrOne[j]  );
                    System.out.println("Index is " + i + " and "  +j);

                }

            }


        }



    }



}
