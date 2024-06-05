package FactoryDesignPattern;

import java.util.Collections;
import java.util.Map;

public class BuilderPersonPattern {

    private  String name;
    private  int age;


    public BuilderPersonPattern setName(String name) {
        this.name = name;
        return this;
    }

    public BuilderPersonPattern setAge(int age) {
        this.age = age;
        return this;
    }

    public Person getPerson(){
        return new Person(name,age);
    }
}
