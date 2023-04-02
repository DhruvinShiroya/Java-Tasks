package Task6;
// subject : Advance Object oriented Prog-Java
// Author name : dhruvin shiroya
// Student id : 200503894

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task2 {

    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Dhruvin");
        strList.add("Benoir");
        strList.add("Sherlock");
        strList.add("Advance Java");
        strList.add("Garbage Collection");
        strList.add("Rust");
        strList.add("is Awesome");

        Stream<Object> stringStream = Stream.builder()
                .add("Dhruvin")
                .add("Benoir")
                .add("Sherlock")
                .add("Advance Java")
                .add("Garbage Collection")
                .add("Rust")
                .add("is Awesome")
                .build();

        stringStream.forEach(e -> System.out.println(e.toString().toUpperCase()));

    }
}
