package RealTimeQuestionsAndPracticeSession;

import data.Student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PracticePaperTavan {

    public static void main(String[] args){

        List<RealTimeQuestionsAndPracticeSession.Employee> al = new ArrayList<RealTimeQuestionsAndPracticeSession.Employee>();

        al.add(new RealTimeQuestionsAndPracticeSession.Employee(1,5000,31));
        al.add(new RealTimeQuestionsAndPracticeSession.Employee(2,15000,29));
        al.add(new RealTimeQuestionsAndPracticeSession.Employee(3,25000,27));
        al.add(new RealTimeQuestionsAndPracticeSession.Employee(4,30000,28));
        al.add(new RealTimeQuestionsAndPracticeSession.Employee(5,30000,27));


        int minAge = al.stream()
                .sorted(Comparator.comparing(Employee::getAge))
                .map(Employee::getAge)
                .findFirst()
                .orElse(0);

        System.out.println("Min Age is " + minAge);

        Optional<Employee> response  =al.stream()
                .filter(t->t.getAge()==minAge)
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

        System.out.println(response.get());



    }
}
