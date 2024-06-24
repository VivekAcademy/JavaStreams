package PracticeSheet;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HandsOn18July {

    public static void main(String[] args){

        List<String> listOfString = Arrays.asList("()", "()[]{}", "(]", "([)]", "{[]}", "", "([{}])", "[(])");
        List<String> response=listOfString.stream()
                .filter(t-> (t.contains("(")&& t.contains(")")) || (t.contains("{")&& t.contains("}")) || (t.contains("[")&& t.contains("]")))
                .collect(Collectors.toList());
        System.out.println(response);








    }
}
