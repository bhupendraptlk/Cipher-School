import java.util.ArrayList;
import java.util.Collections;
//Write a Java program to reverse elements in a array list
//Collections.reverse(list) is used to reverse a list
public class D6p2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(){
            {
                add("B");
                add("C");
                add("DEF");
                add("GHI");
            }
        };
        Collections.reverse(list);
        int i=0;
        while(i<list.size()){
            System.out.println(list.get(i));
            i++;
        }
    }
}
