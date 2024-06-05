package FactoryDesignPattern;

public class ProcessMain {

    public static void main(String[] args){

        //Factory Design Pattern
        FactoryDesign factoryDesign = new FactoryDesign();
        OS os = factoryDesign.methodImpl("IOS");
        os.specify();

        // Builder Design Pattern

        Person p = new BuilderPersonPattern().setAge(21).getPerson();
        System.out.println(p.toString());

        // Adapter Design Pattern
        Pen pen = new PenAdapter();
        Assignment ass = new Assignment();
        ass.setPen(pen);
        ass.writeAssignment("My Name is Vivek Jain");




    }
}
