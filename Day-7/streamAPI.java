import java.util.*;
import java.util.stream.Stream;

public class streamAPI {
    public static void main(String[] args) {
        Stream<String> emptyStream = Stream.empty();

        //Crating stream from arrays

        Collection<String> courses = Arrays.asList("Java","Cpp","C","PHP","Python");
        Stream<String> coursesStream = courses.stream();
        System.out.println(coursesStream);

        //Other methods of creating streams

        Stream<String> colors = Stream.of("Black","Red","Blue","Grey");

        //Creating stream from an existing array

        String arr[] = new String[]{"Guitar","Sitar","Piano","Harmonica","Violin"};
        Stream<String> cartStream = Arrays.stream(arr);

        //Using StreamBuilder to create stream
        Stream<String> beverages = Stream.<String>builder().add("Tea").add("Bear").add("Coffee").add("Juice").build();

        //Stream.Generate()

        Stream<String> fun = Stream.generate(()->"Hehe").limit(5);
        fun.forEach(i-> System.out.println(i));
    }
}
