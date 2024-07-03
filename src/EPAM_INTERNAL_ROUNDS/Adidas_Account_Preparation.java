package EPAM_INTERNAL_ROUNDS;

import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Adidas_Account_Preparation {

    public static void main(String[] args){

        int number = 445679;
        Integer sum = IntStream.rangeClosed(0,String.valueOf(number).length()-1)
                .boxed()
                .filter(t->t==0 || t==String.valueOf(number).length()-1)
                .map(t->String.valueOf(number).split("")[t])
                .collect(Collectors.summingInt(Integer::parseInt));

        System.out.println("SUM of first and last digits are " + sum);


        // Sorted based on Second Character
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        listOfStrings.stream()
                .sorted(Comparator.comparing(t->t.substring(1,2)))
                .forEach(System.out::println);

        // Reversed Sorted Based on Occurrence
        List<Integer> integerList = Arrays.asList(1,1,1,1,1,2,2,2,2,3,3,3,3,3,3,4,4,5,5,5,5,5,5,5);
        Map<Integer,Long> initialResponse =integerList.stream()
                .collect(Collectors.groupingBy(t->t,Collectors.counting()));
        List<Integer> finalResponse =initialResponse.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).reversed();
        System.out.println(finalResponse);

        // Find Numeric Character in Strings
        String str = "a1b2c3d4e5f6g7h8i9j0";
        Arrays.stream(str.split(""))
                .filter(t->Character.isDigit(t.charAt(0)))
                .forEach(System.out::println);

        List<Integer> al = Arrays.asList(1,2,3,4,5);
        List<Integer> response =al.stream()
                .map(t->{
                    if(t%2==0){
                        return t*2;
                    }
                    else {
                        return t*3;
                    }
                }).collect(Collectors.toList());
        System.out.println(response);


        // Age sum based on Name Contain Sachin as well address should be delhi
        int ageSum = PersonDatabase.findPersonList()
                .stream()
                .filter(t -> t.getName().contains("SACHIN") || Arrays.stream(t.getAddresses()).anyMatch(address -> address.getCity().equalsIgnoreCase("Delhi"))).mapToInt(Person::getAge).sum();
        System.out.println(ageSum);

        // Number which is in ODD Occurrence
        List<Integer> listofInteger = Arrays.asList(1,2,4,1,2,3,5);
        Map<Integer,Long> value=listofInteger.stream()
                .collect(Collectors.groupingBy(t->t,Collectors.counting()));
        List<Integer> actualResponse  = value.entrySet().stream()
                .filter(t->t.getValue()%2==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(actualResponse);






        




    }
}
