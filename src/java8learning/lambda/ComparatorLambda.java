package java8learning.lambda;

import java.util.*;


public class ComparatorLambda {
    public static void main(String[] args) {
        // Lambda way
        Comparator<String> compLambda = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
        // Method References
        Comparator<String> comp = Comparator.comparing(String::length);
        List<String> list = Arrays.asList("***", "**", "*****", "*");

        System.out.println("==================== Original ====================");
        list.forEach(System.out::println);

        Collections.sort(list, compLambda);
        System.out.println("==================== compLambda ====================");
        list.forEach(System.out::println);

        Collections.sort(list, comp);
        System.out.println("==================== Method References ====================");
        list.forEach(System.out::println);

        // Another way write
        Collections.sort(list, Comparator.comparing((String s) -> s.length()));
        System.out.println("==================== Another way write ====================");
        list.forEach(System.out::println);
    }
}
