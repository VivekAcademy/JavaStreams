package RealTimeQuestionsAndPracticeSession;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PracticePaperCoforge {

    public static void main(String[] args){

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        List<String> response = words.stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());

        System.out.println(response);

        String str = "a1b2c3d4e5f6g7h8i9j0";

        Arrays.stream(str.split(""))
                .filter(t->Character.isDigit(t.charAt(0)))
                .forEach(System.out::println);







    }
}
