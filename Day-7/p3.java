import java.util.stream.Stream;
//Bhupendra Patel
public class p3 {
    public static void main(String[] args) {
        Stream<String> values = Stream.of("abc"," ","bcd"," ","defg","jk");
        Stream<String> filtered = values.filter(val->val.toLowerCase().startsWith("a"));
        System.out.println("It has "+filtered.count()+" strings which startsWith 'a'");
    }
}
