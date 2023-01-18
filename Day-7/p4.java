import java.util.stream.Stream;
//Bhupendra Patel
public class p4 {
    public static void main(String[] args) {
        Stream<String> values = Stream.of("abc"," ","bcd"," ","defg","jk");
        Stream<String> filtered = values.filter(val->!val.equals(" "));
        filtered.forEach(ele-> System.out.println(ele));
    }
}
