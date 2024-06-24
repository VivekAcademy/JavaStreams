package PracticeSheet;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Hands10June {

    public static void main(String[] args){

       Map<Integer,String> hashMap = new HashMap<>();

       hashMap.put(1,"Vivek");
       hashMap.put(2,"Brutish");
        hashMap.put(3,"Aashvi");

      hashMap.replaceAll((key,value)-> value.toUpperCase());
      hashMap.forEach((key,value)-> System.out.println("Key is " + key + " Value is " + value));



    }

}
