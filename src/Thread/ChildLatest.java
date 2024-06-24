package Thread;

public class ChildLatest implements Runnable{

    private final int name;

    public ChildLatest(int name){

        this.name=name;
    }

    @Override
    public void run(){
        for(int i = 0 ; i< 5; i++){
            try {
                Thread.sleep(3000);
                System.out.println("Child Thread " + name);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


        }


    }
}
