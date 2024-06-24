package PracticeSheet;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HandsOn19July {

    public static void main(String[] args){

        List<Integer> listofInteger = Arrays.asList(1,2,4,1,2,3,5);
        Map<Integer,Long> initialResponse=  listofInteger.stream()
                .collect(Collectors.groupingBy(t->t, LinkedHashMap::new,Collectors.counting()));


        initialResponse.entrySet().stream()
                .filter(t->t.getValue()%2==1)
                .map(t->t.getKey())
                .forEach(System.out::println);
        
    }
}
