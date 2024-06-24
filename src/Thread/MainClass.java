package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainClass {

    public static void main(String[] args){

        //ChildThread.i = Thread.currentThread();

        try (ExecutorService executorService = Executors.newFixedThreadPool(3)) {

            for(int i = 0; i<5 ; i++){

                Runnable r= new ChildThread(i);
                executorService.submit(r);
            }
        }
    }
}
