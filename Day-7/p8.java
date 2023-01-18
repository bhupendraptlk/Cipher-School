/*
    Input
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29


    Output:
    Highest prime number in List : 29
    Lowest prime number in List : 2
    Sum of all prime numbers : 129
    Average of all prime numbers : 12.9
 */
import java.util.Optional;
import java.util.*;
import java.util.stream.Stream;
//Bhupendra Patel
public class p8 {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(2,3,5,7,11,13,17,19,23,29);
//        Stream<Integer> allVals = values.stream();
        Optional<Integer> highPrime = values.stream().reduce((ele1,ele2)->Math.max(ele1,ele2));
        System.out.println("Highest : "+highPrime.get());
        Optional<Integer> lowPrime = values.stream().reduce((ele1,ele2)->Math.min(ele1,ele2));
        System.out.println("Lowest Prime number : "+lowPrime.get());
        Optional<Integer> sumPrime = values.stream().reduce((sum,ele)->sum+ele);
        System.out.println("Sum : "+sumPrime.get());
        System.out.println("Average : "+(float)sumPrime.get()/values.size());
    }
}
