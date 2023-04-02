// subject : Advance Object oriented Prog-Java
// Author name : dhruvin shiroya
// Student id : 200503894
package Task6;

import java.util.OptionalDouble;
import java.util.OptionalLong;
import java.util.function.Supplier;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {


        Supplier<LongStream> streamSupplier = () -> LongStream.range(1L,101L);

        // find min max avg sum of the longStream

        OptionalLong min = streamSupplier.get().min();
        OptionalDouble avg = streamSupplier.get().average();
        OptionalLong max = streamSupplier.get().max();
        OptionalDouble sum = OptionalDouble.of(streamSupplier.get().sum());

        System.out.println("Minimum in longSream is : " + min);
        System.out.println("Average value of longStrem is : " + avg);
        System.out.println("Maximum value of longStream is : "+ max);
        System.out.println("Sum of all the element in longstrem is : " + sum);


    }

}
