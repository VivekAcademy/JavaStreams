package PracticeSheet;

import java.util.stream.IntStream;

public class Infotech {

    public static void main(String[] args){

        String s1 = "123";
        String s2= "45";

        String response = String.valueOf(Integer.parseInt(s1)+Integer.parseInt(s2));
        System.out.println(response);

        int[] arr = new int[]{1,2,3,4,5,6};

        IntStream.rangeClosed(0,arr.length-1)
                .boxed()
                .filter(t-> t==1 || t==arr.length-1-1)
                .map(t-> arr[t])
                .forEach(System.out::println);






    }



}
