package RealTimeQuestionsAndPracticeSession;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticePaperGeneral {

    public static void main(String[] args){

       // String s = "abccddeeabcdd";
       // String result =  "abc2d2e2abcd2";


        int[] arrOne = new int[]{1,2,3,4,5,6};

        Map<String, List<Integer>> initialResponseOne  =Arrays.stream(arrOne)
                .boxed()
                .collect(Collectors.groupingBy(t->t%2==0 ? "EVEN" : "ODD"));

        initialResponseOne.entrySet()
                .stream()
                .filter(t->t.getKey().equals("EVEN"))
                .map(t->t.getValue())
                .flatMap(List::stream)
                .map(t->t*2)
                .forEach(System.out::println);

/*
        String string = "12345";
        String anotherString = "6789";

        Stream.concat()
*/


        String str1  = "vivek";
        String str2 = "jain";
        String str3 = "vjiavienk";

        String response = Stream.concat(Arrays.stream(str1.split("")), Arrays.stream(str2.split(""))).collect(Collectors.joining());
        System.out.println(response);

        int[] arr = new int[]{1,2,3,4,5,6};
        Map<Boolean, List<Integer>> initialResponse=Arrays.stream(arr)
                        .boxed()
                                .collect(Collectors.partitioningBy(t->t%2==0));

       for(Map.Entry<Boolean, List<Integer>> value : initialResponse.entrySet()){
           if(value.getKey()){
               System.out.print("EVEN ");
               value.getValue().forEach(t->System.out.print(" " + t*2 + ","));
           }
            else{
               System.out.print("ODD ");
               value.getValue().forEach(t->System.out.print(" " + t*3 + ","));

           }


       }




        firstAndLastDigitSum();
        mulElementInArray();
        findSumEighty();
        secondMaxCharactar();


    }

    private static void firstAndLastDigitSum() {
        int number = 345;

        Integer sum = IntStream.rangeClosed(0,String.valueOf(number).length()-1)
                        .boxed()
                                .filter(t->t==0||t==String.valueOf(number).length()-1)
                                        .map(t->String.valueOf(number).split("")[t])
                                                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("SUM is " + sum);
    }

    private static void mulElementInArray() {
        // [1,2,3,4] = [24,12,8,6]
        int[] arrTwo = new int[]{1,2,3,4};
        int[] response = new int[4];

        for(int i=0 ; i<arrTwo.length ; i++){
            int mul = 1;
            for(int j=0; j<arrTwo.length ; j++){
                if(i !=j){
                    mul = arrTwo[j]*mul;

                }


            }
            response[i]=mul;


        }
        System.out.println(Arrays.toString(response));
    }

    private static void secondMaxCharactar() {
        // // Second Max Character
        String  string = "I like to visit australia";
        String response = Arrays.stream(string.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElse("");

        System.out.println("Second Max Character is " + response);
    }

    private static void findSumEighty() {
        // //{56,45,87,40,30,50,80} // Sum = 80 //output // elements : 30,50 // indexs : 4,5
        int[] arrOne = new int[]{56,45,87,40,30,50,80};

        for(int i=0 ; i<arrOne.length ; i++){

            for(int j=i+1 ; j<arrOne.length; j++){
                if(arrOne[i]+arrOne[j]==80){

                    System.out.println("Element are " + arrOne[i] + "," + arrOne[j]);
                    System.out.println("Index is " + i + " and " + j);

                }

            }
        }
    }


}
