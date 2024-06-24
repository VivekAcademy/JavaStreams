package PracticeSheet;

import java.util.*;
import java.util.stream.Collectors;

public class SelfHandsOn {

    public static void main(String[] args){

        String  s = "I like to visit australia";

        String secondMaxCharactar = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondMaxCharactar);





    }
}
