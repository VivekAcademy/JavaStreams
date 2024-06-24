package Interview_Final;

import java.util.*;

public class Cognizant {

    public static void main(String[] args){

        Set<Employee> hashSet = new HashSet<>();
        Employee e1 = new Employee(1,"Vivek");
        Employee e2 = new Employee(1,"Raj");
        System.out.println(hashSet.add(e1));
        System.out.println(hashSet.add(e2));

        HashMap<Employee,String> detailsOfEmployee = new HashMap<>();
        detailsOfEmployee.put(e1,"1");
        detailsOfEmployee.put(e2,"2");

        detailsOfEmployee.forEach((key,value)-> System.out.println("key is " + key.getName() + " Value is " + value));

        hashSet.forEach(t->System.out.println(t.getName()));

        String  s = "I like to visit australia";

        String response = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst()
                .orElse(null);
        System.out.println(response);





        

    }
}
