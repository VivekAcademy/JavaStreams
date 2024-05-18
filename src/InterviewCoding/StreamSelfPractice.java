package InterviewCoding;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamSelfPractice {

    public static void main(String[] args){

        findElementStartWithOne();
        boolean results = isDistinct();
        System.out.println(results);

        concatArrays();
    }

    private static void concatArrays() {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        Stream.concat(list1.stream(),list2.stream()).forEach(System.out::println);
    }

    private static boolean isDistinct() {
        List<Integer> listOfIntegerTwo = Arrays.asList(1,2,3,4);
        Set<Integer> hashSetOne = new HashSet<>();
        boolean results = listOfIntegerTwo.stream()
                .allMatch(t -> hashSetOne.add(t));
        return results;
    }

    private static void findElementStartWithOne() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
                .map(String::valueOf)
                .filter(t->t.startsWith("1"))
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }
}
