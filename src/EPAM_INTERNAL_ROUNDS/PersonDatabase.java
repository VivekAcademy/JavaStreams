package EPAM_INTERNAL_ROUNDS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonDatabase {

    public static List<Person> findPersonList(){
        Addresses[] pOneAddress = {

                new Addresses("a10", "Banglore", 410014),
                new Addresses("a11", "Mumbai", 310010)
        };

        Addresses[] pTwoAddress = {

                new Addresses("a20", "Hyderabad", 503001),
                new Addresses("a21", "Mumbai", 310010)
        };

        Addresses[] pThreeAddress = {

                new Addresses("a30", "Delhi", 110015),
                new Addresses("a31", "Chennai", 510010)
        };

        Addresses[] pFourAddress = {

                new Addresses("a10", "Banglore", 410014),
                new Addresses("a11", "Mumbai", 310010)
        };

        Person p1 = new Person("SACHIN TENDULKAR", 40, "MALE",pOneAddress);
        Person p2 = new Person("MS DHONI", 36, "MALE", pTwoAddress);
        Person p3 = new Person("SURESH RAINA", 32, "MALE",pThreeAddress);
        Person p4 = new Person("SACHIN JHOSHI", 24, "MALE",pFourAddress);

        List<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);


        return personList;



    }


}

