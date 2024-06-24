package RealTimeQuestionsAndPracticeSession;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticePaperCapgimini {

    public static void main(String[] args){

        List<Integer> listOfInteger = Arrays.asList(1,1,1,1,1,2,2,2,2,3,3,3,3,3,3,4,4,5,5,5,5,5,5,5);
        Map<Integer,Long> response =listOfInteger.stream()
                .collect(Collectors.groupingBy(t->t,Collectors.counting()));

        System.out.println(response);

        List<Integer> values=response.entrySet().stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(values);



    }
}
