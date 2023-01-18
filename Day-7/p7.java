import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
//Bhupendra Patel
public class p7 {
    public static void main(String[] args) {
        //Method-1
        Integer[] vals = new Integer[]{9, 10, 3, 4, 7, 3, 4};
        Stream<Integer> squares = Arrays.stream(vals).map(ele->ele*ele)
                .distinct();
        System.out.println(squares.collect(Collectors.toList()));
        /*
        //Method-2
        List<Integer> vals = new ArrayList<>(){
            {
                add(9);
                add(10);
                add(3);
                add(4);
                add(7);
                add(3);
                add(4);
            }
        };
        Stream<Integer> squares = vals.stream().map(ele->ele*ele).distinct();
        System.out.println(squares.collect(Collectors.toList()));

         */
    }
}
