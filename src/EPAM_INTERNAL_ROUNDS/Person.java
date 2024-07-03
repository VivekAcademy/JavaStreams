package EPAM_INTERNAL_ROUNDS;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {

    private String name;
    private int age;
    private String gender;
    private Addresses[] addresses;

    public Person(String name, int age, String gender, Addresses[] addresses) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Addresses[] getAddresses() {
        return addresses;
    }

    public void setAddresses(Addresses[] addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", addresses=" + Arrays.toString(addresses) +
                '}';
    }
}
