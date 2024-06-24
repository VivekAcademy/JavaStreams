package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mainlatest {

    public static void main(String[] args)  {

        try(ExecutorService executor = Executors.newFixedThreadPool(3)){

            for(int i = 0 ; i<5 ; i++){
                Runnable c = new ChildLatest(i);
                executor.submit(c);

            }


        }





    }
}
