import java.util.stream.Collectors;
import java.util.stream.Stream;
//Bhupendra Patel
public class p6 {

    public static void main(String[] args) {
        Stream<String> values = Stream.of("USA", "JAPAN", "FRANCE", "GERMANY", "ITALY", "U.K.", "CANADA");
        System.out.println(values.collect(Collectors.joining("-")));
    }
}
