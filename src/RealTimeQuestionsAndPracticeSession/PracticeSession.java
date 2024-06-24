package RealTimeQuestionsAndPracticeSession;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeSession {

    public static void main(String[] args){

        String inputString = "Java Concept Of The Day";
        //Case -1
        Map<String,Long> response=Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(t->t, LinkedHashMap::new,Collectors.counting()));

        System.out.println(response);
        // Case-2
        Map<Character,Long> responseOne=inputString.chars()
                .mapToObj(t-> (char) t)
                .collect(Collectors.groupingBy(t->t,LinkedHashMap::new,Collectors.counting()));
        System.out.println(responseOne);


        String responseThree = Arrays.stream(inputString.split(" "))
                .map(t-> new StringBuffer(t).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(responseThree);

        String responseFour = IntStream.rangeClosed(0,inputString.split(" ").length-1)
                .boxed()
                .map(t->inputString.split(" ")[inputString.split(" ").length-1-t])
                .collect(Collectors.joining(" "));
        System.out.println(responseFour);


        String s1 = "ROTATOR";
        String responseFive = IntStream.rangeClosed(0,s1.length()-1)
                .boxed()
                .map(t->s1.split("")[s1.length()-1-t])
                .collect(Collectors.joining());
        System.out.println(responseFive);


        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);

        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String responseSix = listOfStrings.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println(responseSix);

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        OptionalInt value = listOfIntegers.stream()
                        .mapToInt(Integer::intValue)
                                .max();
        System.out.println(value.getAsInt());


        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int[] result =IntStream.concat(Arrays.stream(a),Arrays.stream(b))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(result));

        String sOne = "RaceCar";
        String sTwo = "CarRace";

        String outputOne = Arrays.stream(sOne.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        String outputTwo = Arrays.stream(sTwo.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        System.out.println(outputOne);
        System.out.println(outputTwo);

        int i = 15623;

        Integer sum = Arrays.stream(String.valueOf(i).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);


        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);

        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

        list1.stream()
                .filter(list2::contains)
                .forEach(System.out::println);

        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        int[] reversedArray = IntStream.rangeClosed(0,array.length-1)
                .map(t-> array[array.length-1-t])
                .toArray();
        System.out.println(Arrays.toString(reversedArray));


        List<String> listOfStringsOne = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String,Long> responseSeven=listOfStringsOne.stream()
                .collect(Collectors.groupingBy(t->t,LinkedHashMap::new,Collectors.counting()));

        Optional<Map.Entry<String, Long>> valueResponse = responseSeven.entrySet()
                .stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        System.out.println(valueResponse.get());

        String str = "ROTATOR";

        Boolean flagResponse = IntStream.rangeClosed(0,str.length()/2)
                .noneMatch(t-> str.charAt(t) != str.charAt(str.length()-1-t));
        System.out.println(flagResponse);

        List<String> listOfString = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfString.stream()
                .filter(t->Character.isDigit(t.charAt(0)))
                .forEach(System.out::println);

        List<Integer> listOfInteger = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> duplicateSet =listOfInteger.stream()
                .filter(t-> !hashSet.add(t))
                .collect(Collectors.toSet());
        System.out.println(duplicateSet);

        Map<Integer,Long> responseEight=listOfInteger.stream()
                .collect(Collectors.groupingBy(t->t,Collectors.counting()));
        Set<Integer> duplicateSetOne=responseEight.entrySet()
                .stream()
                .filter(t->t.getValue()>1)
                .map(t->t.getKey())
                .collect(Collectors.toSet());
        System.out.println(duplicateSetOne);

        String inputStringSet = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Set<String> hashSetOfStrings = new HashSet<>();
        String repeatedCharactar = Arrays.stream(inputStringSet.split(""))
                .filter(t->!hashSetOfStrings.add(t))
                .findFirst()
                .orElse(null);
        System.out.println(repeatedCharactar);

        Stream.iterate(new int[] {1,3},f->new int[]{f[1],f[1]+2})
                .limit(10)
                .map(f->f[0])
                .forEach(System.out::println);

        LocalDate s = LocalDate.of(1992,12,20);
        LocalDate currentDate = LocalDate.now();
        System.out.println("AGE IS " + ChronoUnit.YEARS.between(s,currentDate));


        List<String> listOfStringExp = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        String responseTen = IntStream.rangeClosed(0,listOfStringExp.size()-1)
                .boxed()
                .map(t->listOfStringExp.get(listOfStringExp.size()-t-1))
                .findFirst()
                .orElse(null);

        System.out.println(responseTen);

    }

}
