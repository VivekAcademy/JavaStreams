package Thread;

public class ChildThread implements Runnable{

    private final int name;

    public ChildThread(int name) {
        this.name = name;
    }

    // static Thread i ;

    @Override
    public void run(){
        System.out.println("Thread Start " + name);

        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread ENDED " + name);


    }


}
