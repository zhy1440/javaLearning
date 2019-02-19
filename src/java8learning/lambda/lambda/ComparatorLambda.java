package java8learning.lambda.lambda;

import java.util.*;


public class ComparatorLambda {
    public static void main(String[] args) {
        // Lambda way
        Comparator<String> compLambda = (String s1, String s2) -> Integer.compare(s1.length(), s2.length());
        // Comparator way
        Comparator<String> comp = Comparator.comparing(String::length);
        List<String> list = Arrays.asList("***", "**", "*****", "*");

        System.out.println("==================== Original ====================");
        for (String s : list) {
            System.out.println(s);
        }

        Collections.sort(list, compLambda);

        System.out.println("==================== compLambda ====================");

        for (String s : list) {
            System.out.println(s);
        }

        Collections.sort(list, comp);

        System.out.println("==================== comp ====================");
        for (String s : list) {
            System.out.println(s);
        }
        // More easier
        Collections.sort(list, Comparator.comparing((String s)->s.length()));

        System.out.println("==================== More easier ====================");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
