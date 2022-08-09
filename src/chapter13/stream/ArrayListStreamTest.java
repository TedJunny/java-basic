package chapter13.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {
        List<String> sList = new ArrayList<String>();
        sList.add("Tomas");
        sList.add("Edward");
        sList.add("Jack");

        Stream<String> sStream = sList.stream();
        sStream.forEach(s -> System.out.println(s));

        sList.stream().sorted().forEach(s -> System.out.println(s));
    }
}
