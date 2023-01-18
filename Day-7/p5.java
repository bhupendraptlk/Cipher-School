import java.util.stream.Stream;
//Bhupendra Patel
public class p5 {
    public static void main(String[] args) {
        Stream<String> values = Stream.of("abc"," ","bcd"," ","defg","jk");
        Stream<String> filteredValues = values.filter(ele->ele.length()>2 & !ele.equals(" "));
        filteredValues.forEach(ele-> System.out.println(ele));
    }
}
