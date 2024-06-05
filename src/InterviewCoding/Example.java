package InterviewCoding;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Example {

    private static Example instance;

    private Example(){

    }

    public static Example getInstance(){

        if(instance==null){
            instance = new Example();
        }
        return instance;

    }


}
