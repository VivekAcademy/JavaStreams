package Thread;

public class ChildFirst implements  Runnable{
    @Override
    public void run() {
        System.out.println("Thread Started");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread Completed");
    }
}
