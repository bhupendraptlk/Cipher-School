//Write a Java program to retrieve but does not remove, the first element of a linked list.

import java.util.LinkedList;

public class D6p4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(){
            {
                add("Hey");
                add("Ohayo");
                add("sensei");
            }
        };
        System.out.println(list.peek());
    }
}
