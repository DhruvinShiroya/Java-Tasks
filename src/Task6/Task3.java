package Task6;
// subject : Advance Object oriented Prog-Java
// Author name : dhruvin shiroya
// Student id : 200503894


import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task3 {

    public static void main(String[] args) {

        Random random = new Random();

        IntStream randomIntStream = random.ints(5, 1, 25);
        System.out.println("RandomIntStream Max value is " + randomIntStream.max());
    }
}
