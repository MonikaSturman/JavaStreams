import java.util.*;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args) {
        // Some Stream-based questions and their codes

        // 1. Find the sum of all even numbers in a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int sum = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();


        // 2. Find and print the count of string that have length greater than 5
        List<String> strings = Arrays.asList("apple", "banana", "grape", "watermelon", "kiwi", "orange");

        long count = strings.stream()
                .filter(str -> str.length() > 5)
                .count();


        // 3. Implement function that takes a list of integers as input and returns a new list containing the square of each element
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = nums.stream()
                .map(num -> num * num)
                .collect(Collectors.toList());


        // 4. Find the maximum element in a list of integers
        List<Integer> num = Arrays.asList(10, 5, 25, 15, 30);

        int max = num.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();


        // 5. Concatenate all the strings in a list into a single string
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");

        String concat = fruits.stream().collect(Collectors.joining());


        // 6. Convert each string to uppercase and then sort them in alphabetical order
        List<String> fruit = Arrays.asList("apple", "Banana", "Grape", "Orange", "kiwi");

        List<String> sortedUpperCase = fruit.stream()
                .map(String::toUpperCase)
                .sorted()
                .collect(Collectors.toList());


        // 7. Find the average of all the numbers in a lit of doubles using Streams
        List<Double> doubles = Arrays.asList(1.0, 2.0, 3.0, 4.0, 5.0);

        double average = doubles.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();

        // 8. Create a new list that contains only unique words (remove duplicates)
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");

        List<String> uniqueWords = words.stream()
                .distinct()
                .collect(Collectors.toList());


        // 9. Check if all elements in a List satisfy a given condition using streams
        List<Integer> numbs = Arrays.asList(2, 4, 6, 8, 10);

        boolean allEven = numbs.stream().allMatch(n -> n % 2 == 0);
        System.out.println("All numbers are even: " + allEven);


        // 10. Check if a list contains a specific element using Stream
        boolean exists = numbs.stream().anyMatch(n -> n.equals(9));
        System.out.println(exists);

        // 11. Find the longest string in a list using Stream
        List<String> fruits02 = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");
        //fruits02.stream().mapToInt(String::length).max();
        // or

        int maxLength = fruits02.stream().mapToInt(String::length)
                .max().orElse(0); // incase the list is empty
        System.out.println("maxLength = " + maxLength);


        // 12. Remove null values from a list using streams
        List<String> listFruits = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");

        List<String> nonNullValues = listFruits.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());


        // 13. Find second-smallest element in a list
        List<Integer> n = Arrays.asList(100, 30, 2, 34, 1);

        Optional<Integer> secondSmallest = n.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst();
        if (secondSmallest.isPresent()) {
            System.out.println("Second smallest element is: " + secondSmallest.get());
        } else {
            System.out.println("The list might not have a second smallest element");
        }


    }
}
