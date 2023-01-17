import java.util.ArrayList;
import java.util.Scanner;

/*
1.1
Write a Java program to create a new array list, add some colors (string) and print out the collection.

 */
public class D6p1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        System.out.println("Enter 5 colors");
        int i=1;
        while(i<=5){
            colors.add(scan.next());
            i++;
        }
        for(String color : colors){
            System.out.println(color);
        }
    }
}
