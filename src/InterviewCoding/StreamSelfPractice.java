package InterviewCoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class StreamSelfPractice {

    public static void main(String[] args){

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
                .map(String::valueOf)
                .filter(t->t.startsWith("1"))
                .map(Integer::parseInt)
                .forEach(System.out::println);

        List<Integer> integerList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> outputSet =integerList.stream()
                .filter(t-> ! hashSet.add(t))
                .collect(Collectors.toSet());
        System.out.println(outputSet);
    }



}
