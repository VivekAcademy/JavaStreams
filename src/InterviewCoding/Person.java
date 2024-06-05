package InterviewCoding;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class Person {

    private final String name;
    private final int age;

    private final Map<String,String> hobbies;


    public Person(String name,int age,Map<String,String> hobbies){

        this.name=name;
        this.age=age;
        this.hobbies=Collections.unmodifiableMap(hobbies);

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }



    public Map<String,String> getHobbies(){
        return hobbies;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                '}';
    }
}
