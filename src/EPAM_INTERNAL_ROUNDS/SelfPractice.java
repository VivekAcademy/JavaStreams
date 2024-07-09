package EPAM_INTERNAL_ROUNDS;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class SelfPractice {

    public static void main(String[] args){

        List<Integer> listOfInteger = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        findEvenAndOddUsingPartition(listOfInteger);
        findEvenAndOddUsingGroupingBy(listOfInteger);
        findDistinctElements();
        countingCharacter();
        reverseDecimalOrdering();
        joinStringsOperation();
        findMaxElement();
        integrateWithReverseOrder();
        checkAnagrams();
        sumOfDigits();
        orderStringsBasedOnLength();
        findCommonElements();
        stringsOperations();
        reversedArray();
        maxOccurence();
        findFirstDigitCharacter();
        findDuplicatesElements();
        printFabonicci();
        printOddNumbers();
        myAge();
        findSecondMaxCharacterBasedOnLength();
        findElementsWithIndexAndSum80();
        findElementsStartsWithOne();
        flattenStreams();
        sumOfFirstAndLastDigit();
        reversedBasedOnElementOccurence();
        findNumericDigitsInStrings();
        findModifiedList();
        sortedStringBasedOnSecondCharactar();
        filterPerson();
        numberInOddOccurence();
        isDistinctElements();
        concatStream();
        removeEvenElements();
        Syntasa_Interview_Question();


        //[1,2,3,4] = [24,12,8,6]
        // String s = "abccddeeabcdd";
        // String result =  "abc2d2e2abcd2";
/*
        String str1  = "vivek";
        String str2 = "jain";
        String str3 = "vjiavienk";

 */




/*
        long start = 0;
        long end = 0;
        start = System.currentTimeMillis();
        IntStream.rangeClosed(1,10).forEach(t->System.out.println("Thread Name " + Thread.currentThread().getName() + " ," + t));
        end = System.currentTimeMillis();
        System.out.println("Total Time Taken in Normal Stream " + (end-start));

        start = System.currentTimeMillis();
        IntStream.rangeClosed(1,10).parallel().forEach(t->System.out.println("Thread Name " + Thread.currentThread().getName() + " ," + t));
        end = System.currentTimeMillis();
        System.out.println("Total Time Taken in Parallel Stream " + (end-start));
*/

    }

    private static void Syntasa_Interview_Question() {
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        Map<String,List<String>> response = new HashMap<>();


        for(int i = 0 ; i< str.length ; i++){
           String value =  Arrays.stream(str[i].split(""))
                    .sorted()
                    .collect(Collectors.joining());
            if(response.isEmpty() || !response.containsKey(value)){
                List<String> listOfValues = new ArrayList<>();
                listOfValues.add("\"" + str[i] + "\"");
                response.put(value,listOfValues);
            }

            else{
                response.get(value).add("\"" + str[i] + "\"");
            }
        }

        for(Map.Entry<String,List<String>> value : response.entrySet()){
            System.out.println(value.getValue());
        }
        System.out.println(response.values());
    }

    private static void removeEvenElements() {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
        for(int i=0 ; i<integerList.size() ; i++){

            if (integerList.get(i)%2==0){
                integerList.remove(i);

            }
        }
        System.out.println(integerList);
    }

    private static void concatStream() {
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        List<String> response =Stream.concat(list1.stream(),list2.stream())
                .collect(Collectors.toList());
        System.out.println(response);
    }

    private static void isDistinctElements() {
        List<Integer> listOfIntegerTwo = Arrays.asList(1,2,3,4);
        Set<Integer> hashSet = new HashSet<>();
        boolean result = listOfIntegerTwo.stream()
                .noneMatch(t->!hashSet.add(t));
        System.out.println("Distinct Elements is " + result);
    }

    private static void numberInOddOccurence() {
        // Number which is in ODD Occurrence
        List<Integer> listofInteger = Arrays.asList(1,2,4,1,2,3,5);
        Map<Integer,Long> value=listofInteger.stream()
                .collect(Collectors.groupingBy(t->t,Collectors.counting()));
        List<Integer> actualResponse  = value.entrySet().stream()
                .filter(t->t.getValue()%2==1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
        System.out.println(actualResponse);
    }

    private static void filterPerson() {
        // Age sum based on Name Contain Sachin as well address should be delhi
        int ageSum = PersonDatabase.findPersonList()
                .stream()
                .filter(t -> t.getName().contains("SACHIN") || Arrays.stream(t.getAddresses()).anyMatch(address -> address.getCity().equalsIgnoreCase("Delhi"))).mapToInt(Person::getAge).sum();
        System.out.println(ageSum);
    }

    private static void sortedStringBasedOnSecondCharactar() {
        // Sorted based on Second Character
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        listOfStrings.stream()
                .sorted(Comparator.comparing(t->t.substring(1,2)))
                .forEach(System.out::println);
    }

    private static void findModifiedList() {
        // EVEN*2 and ODD*3
        List<Integer> al = Arrays.asList(1,2,3,4,5);
        List<Integer> effectiveResponse =al.stream()
                .map(t-> {
                    if(t%2==0){
                        return t*2 ;
                    }
                    else {
                        return t*3;
                    }

                }).toList();
        System.out.println(effectiveResponse);
    }

    private static void findNumericDigitsInStrings() {
        // Find Numeric Digit in Strings
        String str = "a1b2c3d4e5f6g7h8i9j0";
        List<String> response =Arrays.stream(str.split(""))
                .filter(t->Character.isDigit(t.charAt(0)))
                .collect(Collectors.toList());
        System.out.println(response);
    }

    private static void reversedBasedOnElementOccurence() {
        // Reversed Sorted Based on Occurrence
        List<Integer> integerList = Arrays.asList(1,1,1,1,1,2,2,2,2,3,3,3,3,3,3,4,4,5,5,5,5,5,5,5);

        Map<Integer,Long> response =integerList.stream()
                .collect(Collectors.groupingBy(t->t,Collectors.counting()));
        List<Integer> finalResponse =response.entrySet()
                .stream()
                .sorted(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList()).reversed();
        System.out.println(finalResponse);
    }

    private static void sumOfFirstAndLastDigit() {
        int number = 345678;

        Integer sum =  IntStream.rangeClosed(0,String.valueOf(number).length()-1)
                 .boxed()
                 .filter(t->t==0 || t==String.valueOf(number).length()-1)
                 .map(t->String.valueOf(number).split("")[t])
                 .collect(Collectors.summingInt(Integer::parseInt));

        System.out.println("Sum is " + sum);
    }

    private static void flattenStreams() {
        List<List<List<String>>>  newList = Arrays.asList(Arrays.asList(Arrays.asList("Vivek")));
        List<String> response =newList.stream()
                .flatMap(List::stream)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(response);
    }

    private static void findElementsStartsWithOne() {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
        myList.stream()
                .map(String::valueOf)
                .filter(t->t.startsWith("1"))
                .map(Integer::parseInt)
                .forEach(System.out::println);
    }

    private static void findElementsWithIndexAndSum80() {
        int[] arr = new int[]{56,45,87,40,30,50,80};

        for(int i = 0 ; i< arr.length ; i++){

            for(int j= i+1 ; j<arr.length ; j++){

                if(arr[i]+arr[j]==80){
                    System.out.println("Elements Are " + arr[i] + " , " + arr[j]);
                    System.out.println("Index is " + i + " , " + j);
                }

            }

        }
    }

    private static void findSecondMaxCharacterBasedOnLength() {
        String  s = "I like to visit australia";

        String secondMaxCharacter = Arrays.stream(s.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(1)
                .findFirst().orElse("");
        System.out.println(secondMaxCharacter);
    }

    private static void myAge() {
        LocalDate myBirthday = LocalDate.of(1991,12,20);
        LocalDate currentDate = LocalDate.now();
        System.out.println("My Ages is " + ChronoUnit.YEARS.between(myBirthday,currentDate));
    }

    private static void printOddNumbers() {
        Stream.iterate(new int[] {1,3}, f->new int[] {f[1],2+f[1]})
                .limit(10)
                .map(f->f[0])
                .forEach(System.out::println);
    }

    private static void printFabonicci() {
        Stream.iterate(new int[] {0,1}, f->new int[] {f[1],f[0]+f[1]})
                .limit(10)
                .map(f->f[0])
                .forEach(System.out::println);
    }

    private static void findDuplicatesElements() {
        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333,111, 111, 555, 333, 777, 222);
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> result =listOfIntegers.stream()
                .filter(t->!hashSet.add(t))
                        .collect(Collectors.toSet());
        System.out.println(result);

        Map<Integer,Long> response =listOfIntegers.stream()
                .collect(Collectors.groupingBy(t->t,LinkedHashMap::new,Collectors.counting()));
        List<Integer> finalResponse =response.entrySet().stream()
                .filter(t->t.getValue()>1)
                .map(t->t.getKey())
                .collect(Collectors.toList());
        System.out.println(finalResponse);
    }

    private static void findFirstDigitCharacter() {
        List<String> listOfStrings = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        listOfStrings.stream()
                .filter(t->Character.isDigit(t.charAt(0)))
                .forEach(System.out::println);
    }

    private static void maxOccurence() {
        List<String> listOfStrings = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String,Long> response =listOfStrings.stream()
                .collect(Collectors.groupingBy(t->t,Collectors.counting()));
        Map.Entry<String, Long> finalResponse  = response.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue)).orElse(null);
        System.out.println(finalResponse);
    }

    private static void reversedArray() {
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] reversedArray = IntStream.rangeClosed(0,array.length-1)
                .map(t-> array[array.length-1-t])
                .toArray();
        System.out.println(Arrays.toString(reversedArray));
    }

    private static void stringsOperations() {
        String str = "Java Concept Of The Day";
        String reversedWord = Arrays.stream(str.split(" "))
                .map(t-> new StringBuffer(t).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(reversedWord);

        String orderOfWord = IntStream.rangeClosed(0,str.split(" ").length-1)
                .boxed()
                .map(t-> str.split(" ")[str.split(" ").length-1-t])
                .collect(Collectors.joining(" "));
        System.out.println(orderOfWord);

        String word = "ROTATOR";

        String pallindromeString = IntStream.rangeClosed(0,word.length()-1)
                .boxed()
                .map(t->word.split("")[word.length()-1-t])
                .collect(Collectors.joining());
        System.out.println(pallindromeString);

        if(word.equals(pallindromeString)){
            System.out.println("String is Palindrome ");
        }

        Boolean isPalindrome = IntStream.rangeClosed(0,word.length()/2)
                .noneMatch(t-> word.charAt(t) != word.charAt(word.length()-1-t));
        if(isPalindrome){
            System.out.println("String is Palindrome");
        }
    }

    private static void findCommonElements() {
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        list1.stream()
                .filter(list2::contains)
                .forEach(System.out::println);
    }

    private static void orderStringsBasedOnLength() {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        listOfStrings.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(System.out::println);
    }

    private static void sumOfDigits() {
        int i = 15628;

        Integer sum = Arrays.stream(String.valueOf(i).split(""))
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sum);

        Integer sumNew = IntStream.rangeClosed(0,String.valueOf(i).split("").length-1)
                .boxed()
                .filter(t-> t==0 || t==String.valueOf(i).length()-1)
                .map(t->String.valueOf(i).split("")[String.valueOf(i).length()-1-t])
                .collect(Collectors.summingInt(Integer::parseInt));
        System.out.println(sumNew);
    }

    private static void checkAnagrams() {
        String s1 = "RaceCar";
        String s2 = "CarRace";

        String AnagramsOne = Arrays.stream(s1.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());

        String AnagramsTwo = Arrays.stream(s2.split(""))
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.joining());
        if(AnagramsOne.equals(AnagramsTwo)){
            System.out.println("Strings Are Anagrams");
        }
    }

    private static void integrateWithReverseOrder() {
        int[] a = new int[] {4, 2, 7, 1};

        int[] b = new int[] {8, 3, 9, 5};

        int[] resultArray = IntStream.concat(Arrays.stream(a),Arrays.stream(b))
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        System.out.println(Arrays.toString(resultArray));
    }

    private static void findMaxElement() {
        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Integer firstWay=listOfIntegers.stream()
                .reduce((a,b)->a>b ? a :b).orElse(0);
        System.out.println(firstWay);

        Integer secondWay=listOfIntegers.stream()
                .reduce(Integer::max).orElse(0);
        System.out.println(secondWay);

        Integer thirdWay=listOfIntegers.stream()
                        .sorted(Comparator.reverseOrder())
                                .findFirst().orElse(0);
        System.out.println(thirdWay);

        OptionalInt fourthWay=listOfIntegers.stream()
                .mapToInt(Integer::intValue)
                        .max();
        System.out.println(fourthWay.getAsInt());

        Integer fifthWay=listOfIntegers.stream()
                        .max(Comparator.comparing(t -> t)).orElse(0);
        System.out.println(fifthWay);
    }

    private static void joinStringsOperation() {
        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
        String response = listOfStrings.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println(response);
    }

    private static void reverseDecimalOrdering() {
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        decimalList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }

    private static void countingCharacter() {
        String inputString = "Java Concept Of The Day";
        Map<String,Long> response =Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(t->t, LinkedHashMap::new,Collectors.counting()));
        System.out.println(response);

        Map<Character,Long> responseOne =inputString.chars()
                .mapToObj(c-> (char) c)
                .collect(Collectors.groupingBy(t->t,Collectors.counting()));
        System.out.println(responseOne);
    }

    private static void findDistinctElements() {
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        listOfStrings.stream()
                .distinct()
                .forEach(System.out::println);
    }

    private static void findEvenAndOddUsingGroupingBy(List<Integer> listOfInteger) {
        Map<String,List<Integer>> separateEvenAndOddByGroupingBy= listOfInteger.stream()
                .collect(Collectors.groupingBy(t->t%2==0 ? "EVEN" : "ODD"));
        System.out.println(separateEvenAndOddByGroupingBy);
    }

    private static void findEvenAndOddUsingPartition(List<Integer> listOfInteger) {
        Map<Boolean,List<Integer>> separateEvenAndOddByPartition = listOfInteger.stream()
                .collect(Collectors.partitioningBy(t->t%2==0));

        for(Map.Entry<Boolean,List<Integer>> value : separateEvenAndOddByPartition.entrySet()){

            if(value.getKey()){
                System.out.println("Following Number is Even");
            }
            else{
                System.out.println("Following Number is ODD");
            }

            for(int number : value.getValue()){
                System.out.println(number);
            }

        }
    }

}
