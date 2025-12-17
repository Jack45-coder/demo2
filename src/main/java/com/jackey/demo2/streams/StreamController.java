package com.jackey.demo2.streams;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamController {
    public static void main(String[] args) {
        // stream is a data pipeline -> process one element at a time
        // source -> intermediate operations -> terminal operations
        Consumer<Number> printer = System.out::println;

        Stream<Integer> stream = Stream.of(10, 18, 34, 25, 56);
        stream.filter(e -> e%2 == 0)  // intermediate operations
                .map(num -> num * num + 3.75)
                .forEach(printer); // Terminal operation
//        stream.forEach(printer);  // IllegalStateException

        // lambda
        // functional interface
        // Predicate -> filter [based on certain conditions]
        // Function -> data transformation [map -> Function<T, R>]
        // Consumer -> terminal operation [for each] --> [void]
        // Supplier -> provides data [no input - only output]

        Supplier<Short> supplier = () -> (short)(Math.random() * 100);
        System.out.println("Random Generate: " + supplier.get());

        // data transformation
        // map and flatmap

        Stream<String> names = Stream.of("Ravi", "Bablu", "Abhishek", "John", "Alice", "JAckey");

        names.map(s -> s.length())
                .forEach(System.out::println);

        Stream<List<String>> batchListStream = Stream.of(
                List.of("Ravi", "Bablu"),
                List.of("John", "Alice", "Bob"),
                List.of("Abhishek", "Charlie")
        );

//        batchListStream.map(s -> s.size())
//                .forEach(len -> System.out.println("List Length: " +len));

//        batchListStream.map(s -> s.stream())
//                .forEach(len -> System.out.println(len));

        // map -> one to one mapping
        // flatMap -> one to many mapping

        batchListStream.flatMap(s -> s.stream())
                .forEach(len -> System.out.println("Flattened List Element: " + len));



    }
}
