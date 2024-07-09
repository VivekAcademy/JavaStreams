package Sorting;

import java.util.*;

public class PracticeMain {

    public static void main(String[] args){
/*
        Comparator<Student> comparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if(o1.getAge()>o2.getAge()) {
                    return 1;
                } else if (o1.getAge()==o2.getAge()) {
                    return 0;
                } else {
                    return -1;
                }
            }
        };

 */

        Student s1 = new Student("Vivek",32);
        Student s2 = new Student("Ayush",27);
        Student s3 = new Student("Shruti",31);
        Student s4 = new Student("Aashvi",2);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        Collections.sort(studentList);

        for(Student s : studentList){
            System.out.println(s);
        }












    }


}
