package RealTimeQuestionsAndPracticeSession;

import java.util.*;
import java.util.stream.Collectors;

public class PracticePaperSyntasa {

    public static void main(String[] args){
        findResultUsingLoop();
        findResultUsingHashMap();
    }

    private static void findResultUsingHashMap() {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> response = new ArrayList<>();
        Map<String,List<String>> mapDetails = new HashMap<>();

        for(int i=0 ;i<str.length ; i++){

            String Anagrams = Arrays.stream(str[i].split("")).sorted().collect(Collectors.joining());

            if(mapDetails.isEmpty() || !mapDetails.containsKey(Anagrams)){
                List<String> listOfString = new ArrayList<>();
                listOfString.add("\"" + str[i] + "\"");
                mapDetails.put(Anagrams,listOfString);
            }
            else if( mapDetails.containsKey(Anagrams)){
                mapDetails.get(Anagrams).add("\"" + str[i] + "\"");
            }

        }
        for(Map.Entry<String,List<String>> value : mapDetails.entrySet()){

            response.add(value.getValue());
        }

        System.out.println(response);
        System.out.println(mapDetails.values());
    }

    private static void findResultUsingLoop() {
        //strs = ["eat","tea","tan","ate","nat","bat"]
        //[["bat"],["nat","tan"],["ate","eat","tea"]]
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<String> listOfString = new ArrayList<>();
        List<List<String>> response = new ArrayList<>();
        for(int i=0 ; i<str.length ;i++){
            if(listOfString.isEmpty() || !listOfString.contains(str[i])) {
                List<String> tempArray = new ArrayList<>();
                String initialValue = Arrays.stream(str[i].split("")).sorted().collect(Collectors.joining());
                listOfString.add(str[i]);
                tempArray.add("\"" + str[i] + "\"");
                for (int j = i + 1; j < str.length; j++) {
                    String secondValue = Arrays.stream(str[j].split("")).sorted().collect(Collectors.joining());
                    if (initialValue.equals(secondValue)) {
                        listOfString.add(str[j]);
                        tempArray.add("\"" + str[j] + "\"");
                    }


                }
                response.add(tempArray);
            }

        }

        System.out.println(response);
    }

}
