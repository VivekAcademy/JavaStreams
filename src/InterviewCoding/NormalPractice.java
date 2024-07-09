package InterviewCoding;

import java.util.*;

public class NormalPractice {

    public static void main(String[] args){

        HashMap<String,String> mapValue = new HashMap<>();
        mapValue.put("Hobby","Cricket");
        List<String> laptop = new ArrayList<>(Arrays.asList("Dell","HP"));
        Address address = new Address(201016);
        Set<String>queryList = new HashSet<>();
        queryList.add("My Name is Vivek Jain");


        Person p = new Person("Vivek", 31,mapValue,laptop,address,queryList);
        System.out.println(p.toString());
        p.getQueryList().add("My Name is Aashvi Jain");
        System.out.println(p.toString());




















        Singeleton instanceOne = Singeleton.getInstance();
        Singeleton instanceTwo = Singeleton.getInstance();
        boolean flag = instanceTwo==instanceOne;
        System.out.println(flag);


        System.out.println("--------------------");

        Example e = Example.getInstance();
        Example f = Example.getInstance();
        boolean flagTwo = (e==f) ;
        System.out.println(flagTwo);







    }
}
