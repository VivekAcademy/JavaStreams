package RealTimeQuestionsAndPracticeSession;

import java.util.*;

public class HashMapConcept {

    public static void main(String[] args){

        Employee e1 = new Employee(1,2000,22);
        Employee e2 = new Employee(1,2000,22);

        Boolean flag = e1.equals(e2);
        System.out.println(flag);

        Boolean flagOne = Objects.hash(e1)==Objects.hash(e2);
        System.out.println(flagOne);


        Map<Employee, String> myMap = new HashMap<>();

        myMap.put(new Employee(1,2000,22), "A");
        myMap.put(new Employee(1,2000,22), "A");
        myMap.put(new Employee(1,2000,22), "A");
        myMap.put(new Employee(1,2000,22), "A");

        System.out.println(myMap.size());
        myMap.forEach((key,value) -> System.out.println("Key are " + key + " Value are" + value));

        Set<Employee> hashSet = new HashSet<>();
        hashSet.add(new Employee(1,2000,22));
        hashSet.add(new Employee(1,2000,22));

        System.out.println(hashSet);




    }


}
