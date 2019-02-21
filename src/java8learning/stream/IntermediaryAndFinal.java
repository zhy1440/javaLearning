package java8learning.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntermediaryAndFinal {

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");


        Predicate<String> p1 = Predicate.isEqual("two");
        Predicate<String> p2 = Predicate.isEqual("three");
        List<String> list = new ArrayList<>();

    }
}
