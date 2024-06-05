package PracticeSheet;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SheetPractical {

    public static String fetchData(String str1,String str2,String str3){





        return null ;



    }

    public static void main(String[] args){

        String str1  = "vivek";
        String str2 = "jain";
        String str3 = "vjiavienk";
        char[] ch = new char[]{};

        for(int i = 0 ; i< str1.length() ;i++){
            //ch[i] = str1.charAt(i);
            for(int j = 0 ; j<str2.length() ; j++){
                ch[i*2]+=str2.charAt(j);
                break;
            }

        }




        String concatString =  Stream.concat(Arrays.stream(str1.split("")),Arrays.stream(str2.split("")))
                .collect(Collectors.joining());
        System.out.println(concatString);














    }

}
