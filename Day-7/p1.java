import java.util.Arrays;
import java.util.stream.Stream;
//Bhupendra Patel
public class p1 {
//    static int count=0;
    public static void main(String[] args) {
        String list[] = new String[]{"abc"," ","bcd"," ","defg","jk"};
        Stream<String> emptyTest = Arrays.stream(list);
       Stream<String> empties = emptyTest.filter(ele->(ele.equals(" ")));
        System.out.println(empties.count());
//        empties.forEach(ele->count++);
//        System.out.println(count);
    }
}
