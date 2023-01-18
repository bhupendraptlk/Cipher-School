import java.util.stream.Stream;
import java.util.Optional;
public class ReduceMethod {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5);
        Optional<Integer> ans = numbers.reduce((a,b)->a+b);
        System.out.println(ans);
    }
}
