//Write a Java program to join two array lists.
//addAll() method combines two arrayLists
import java.util.ArrayList;
import java.util.Scanner;
public class D6p3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<>(){
            {
                add("B");
                add("C");
                add("DEF");
                add("GHI");
            }
        };
        ArrayList<String> list2 = new ArrayList<>(){
            {
                add("Z");
                add("y");
                add("X");
                add("wvu");
            }
        };
        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);
    }
}
