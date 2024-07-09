package InterviewCoding;

import java.util.*;

public final class Person {

    private final String name;
    private final int age;

    private final HashMap<String,String> hobbies;
    private final List<String> laptop;
    private final Set<String> queryList;

    private final Address address;


    public Person(String name,int age,HashMap<String,String> hobbies,List<String> laptop,Address address,Set<String> queryList){

        this.name=name;
        this.age=age;
        this.hobbies=hobbies;
        this.laptop=laptop;
        this.address=address;
        this.queryList=queryList;

    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }



    public HashMap<String,String> getHobbies(){
        return new HashMap<>(hobbies);
    }

    public List<String> getLaptop(){
        return new ArrayList<>(laptop);
    }

    public Address getAddress(){
        return new Address(address.getPinCode());
    }

    public Set<String> getQueryList() {
        return new HashSet<>(queryList);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hobbies=" + hobbies +
                ", laptop=" + laptop +
                ", queryList=" + queryList +
                ", address=" + address +
                '}';
    }
}
