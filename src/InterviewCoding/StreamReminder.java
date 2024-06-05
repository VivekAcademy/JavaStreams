package InterviewCoding;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamReminder {

    public static void main(String[] args){

        findEvenAndOdd();
        uniqueElements();
        frequencyOfEachCharacter();
        reversedDoubleValues();
        joiningValues();
        mergedAndSortedArray();
        checkIfAnagramsOrNot();
        digitSum();
        findCommonElements();
        reverseString();
        reversedEachWord();
        reverseWordOrder();
        reversedIntArray();
        mostRepetetiveElements();
        checkIfStringStartWithNumeric();
        checkNumberStartWithOne();
        findOutDuplicates();
        findFirstRepeatedCharacter();
        printFabbonicci();
        printOddNumbers();
        sumOfFirstAndLastDigit();
        reverseListOfStrings();
        flatten();



    }

    private static void flatten() {
        List<List<List<String>>>  newList = Arrays.asList(Arrays.asList(Arrays.asList("Vivek")));
        List<String> output = newList.stream()
                .flatMap(List::stream)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(output);
    }

    private static void reverseListOfStrings() {
        List<String> listOfString = Arrays.asList("Vivek","Aashvi","Shruti");
        List<String> listOfStringOutput=IntStream.rangeClosed(0,listOfString.size()-1)
               .boxed()
               .map(t->listOfString.get(listOfString.size()-1-t))
               .collect(Collectors.toList());
        System.out.println(listOfStringOutput);
    }

    private static void sumOfFirstAndLastDigit() {
        int number = 345678;
        int sumOne = IntStream.rangeClosed(0,String.valueOf(number).length()-1)
                .boxed()
                .filter(t-> t==0 || t==String.valueOf(number).length()-1)
                .map(t->String.valueOf(number).split("")[t])
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumOne);
    }

    private static void printOddNumbers() {
        Stream.iterate(new int[] {1,3}, f-> new int[] {f[1],2+f[1]})
                .limit(10)
                .map(f->f[0])
                .forEach(System.out::println);
    }

    private static void printFabbonicci() {
        Stream.iterate(new int[] {0,1}, f-> new int[] {f[1],f[0]+f[1]})
                .limit(10)
                .map(f->f[0])
                .forEach(System.out::println);
    }

    private static void findFirstRepeatedCharacter() {
        String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Set<String> hashSet = new HashSet<>();
        String firstRepCharacter = Arrays.stream(inputString.split(""))
                .filter(t-> !hashSet.add(t))
                .findFirst()
                .orElse("");
        System.out.println(firstRepCharacter);
    }

    private static void findOutDuplicates() {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> hashSet = new HashSet<>();
        listOfIntegers.stream()
                .filter(t-> !hashSet.add(t))
                .forEach(System.out::println);

        Map<Integer,Long> response =listOfIntegers.stream()
                .collect(Collectors.groupingBy(t->t,LinkedHashMap::new,Collectors.counting()));
        response.entrySet().stream()
                .filter(t->t.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach(System.out::println);
    }

    private static void checkNumberStartWithOne() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        List<Integer> responseList = myList.stream()
                .map(String::valueOf)
                .filter(t->t.startsWith("1"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(responseList);
    }

    private static void checkIfStringStartWithNumeric() {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        List<String> response = listOfStrings.stream()
                .filter(t->Character.isDigit(t.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(response);
    }

    private static void mostRepetetiveElements() {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String,Long> response =listOfStrings.stream()
                .collect(Collectors.groupingBy(t->t,LinkedHashMap::new,Collectors.counting()));
        System.out.println(response);

        Map.Entry<String, Long> s = response.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)).orElse(null);
        System.out.println(s);
    }

    private static void reversedIntArray() {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] reversedArray=IntStream.range(0,array.length)
                .map(t->array[array.length-t-1])
                .toArray();
        System.out.println("Reversed Array Elements are " + Arrays.toString(reversedArray));
    }

    private static void reverseWordOrder() {
        String str = "Java Concept Of The Day";
        String reverseStr = IntStream.rangeClosed(0,str.split(" ").length-1)
                .boxed()
                .map(t->str.split(" ")[str.split(" ").length-1-t])
                .collect(Collectors.joining(" "));
        System.out.println(reverseStr);
    }

    private static void reversedEachWord() {
        String str = "Java Concept Of The Day";
        String reversedStringStmt = Arrays.stream(str.split(" "))
                .map(t-> new StringBuffer(t).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reversedStringStmt);
    }

    private static void reverseString() {
        String str = "ROTATOR";
        String reverseString = IntStream.rangeClosed(0,str.length()-1)
                .boxed()
                .map(t->str.split("")[str.length()-t-1])
                .collect(Collectors.joining());
        System.out.println("Reversed String is " + reverseString);
    }

    private static void findCommonElements() {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        list1.stream()
                .filter(list2::contains)
                .forEach(System.out::println);
    }

    private static void digitSum() {
        int i = 15623;
        int sum  = Arrays.stream(String.valueOf(i).split(""))
                        .map(Integer::parseInt)
                                .collect(Collectors.summingInt(t->t));
        System.out.println("SUM is " + sum);
    }

    private static void checkIfAnagramsOrNot() {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        String anagramsOne = Arrays.stream(s1.split("")).map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());
        String anagramsTwo = Arrays.stream(s2.split("")).map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());
        System.out.println(anagramsOne);
        System.out.println(anagramsTwo);
        if(anagramsOne.equals(anagramsTwo)){
            System.out.println("Both String are Anagrams");
        }
    }

    private static void mergedAndSortedArray() {
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int[] sortedArray = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
                .sorted()
                .toArray();
        System.out.println("Sorted Arrays are " + Arrays.toString(sortedArray));
    }

    private static void joiningValues() {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String response = listOfStrings.stream()
                .collect(Collectors.joining(",","[", "]"));
        System.out.println(response);
    }

    private static void reversedDoubleValues() {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> response =decimalList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(response);
    }

    private static void frequencyOfEachCharacter() {
        String inputString = "Java Concept Of The Day";
        Map<String,Long> response =Arrays.stream(inputString.split("")).collect(Collectors.groupingBy(t->t, LinkedHashMap::new,Collectors.counting()));
        System.out.println(response);

        Map<Character,Long> responseTwo=inputString.chars().mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(t->t,Collectors.counting()));
        System.out.println(responseTwo);
    }

    private static void uniqueElements() {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        listOfStrings.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static void findEvenAndOdd() {
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<String,List<Integer>> response  =listOfIntegers.stream()
                .collect(Collectors.groupingBy(t->t%2==0 ? "EVEN" : "ODD"));
        System.out.println(response);

        Map<Boolean,List<Integer>> responseTwo=listOfIntegers.stream().collect(Collectors.partitioningBy(t->t%2==0));
        for (Map.Entry<Boolean,List<Integer>> oneValue : responseTwo.entrySet()){

            if(oneValue.getKey()){
                System.out.println("EVEN Numbers");
            }
            else{
                System.out.println("Odd Numbers");
            }
            for(int value : oneValue.getValue()){
                System.out.println(value);
            }

        }
    }
}
