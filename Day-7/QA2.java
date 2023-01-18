import java.util.*;
import java.util.stream.Stream;

public class QA2 {
    public static void main(String[] args) {
        String weightPounds = "110 145 180 174 192 180";
        Stream<String> weights = Arrays.stream(weightPounds.split(" "));
//        Stream<Integer> weightsKg = weights.map(ele->(int)(Double.parseDouble(ele)/2.205)); //for Integer Output
        Stream<Double> weightsKg = weights.map(ele->(Double.parseDouble(ele)/2.205));
        weightsKg.forEach(wei-> System.out.println(wei));
    }
}
