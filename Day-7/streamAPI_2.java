import java.util.*;
import java.util.stream.Stream;

public class streamAPI_2 {
    public static void main(String[] args) {
        //Accessing the stream data with forEach loop
        String arr[] = new String[]{"Guitar","Sitar","Piano","Harmonica","Violin"};
        Stream<String> cartStream = Arrays.stream(arr);
        cartStream.forEach(ele-> System.out.println(ele));

        //Filtering

        Stream<Integer> luckyNumbers = Stream.of(5,4,84,21,15,51);
        luckyNumbers.forEach(number-> System.out.println(number));

        Stream<Integer> luckyNumbers1 = Stream.of(5,4,84,21,15,51);
        System.out.println("Printing even numbers present in luckyNumbers1 : ");
        //fetch only even numbers

        Stream<Integer> evenNumbers = luckyNumbers1.filter(num -> num%2==0);
        evenNumbers.forEach(ele-> System.out.println(ele));

    }
}
