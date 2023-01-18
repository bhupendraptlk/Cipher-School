import java.util.stream.Stream;
//Bhupendra Patel
public class p2 {
    public static void main(String[] args) {
        Stream<String> values = Stream.of("abc"," ","bcd"," ","defg","jk");
        Stream<String> filteredValues = values.filter(ele->ele.length()>3);
        System.out.println("It has "+filteredValues.count()+" strings of length more than 3");
    }
}
