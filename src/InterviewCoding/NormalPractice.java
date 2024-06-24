package InterviewCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NormalPractice {

    public static void main(String[] args){

        Map<String,String> mapValue = new HashMap<>();
        mapValue.put("Hobby","Cricket");


        Person p = new Person("Vivek", 31,mapValue);









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
