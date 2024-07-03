package Thread;

public class MainFirst {

    public static void main(String [] args){

        Thread t = new Thread(new ChildFirst());
        t.start();
        System.out.println("Main Thread");


    }
}
