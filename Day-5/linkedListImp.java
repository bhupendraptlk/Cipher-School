import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class linkedListImp {
    public static void main(String[] args) {
        //Linked List implements the collection interface.
        //Linked list used doubly linked list internally to store the data.
        //It allows duplicate elements
        //It is an ordered collection.
        //Linked list has faster performance when manipulating elements
        LinkedList<String> emp = new LinkedList<String>();
        Scanner scan = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("Registering Employee No 000"+i);
            String newEmp = scan.next();
            emp.add(newEmp);
        }
        //Using iterator to access the elements
        //Iterator is like a pointer that helps us fetch elements
        Iterator<String> pointer = emp.iterator();
        while(pointer.hasNext()){
            System.out.println(pointer.next());
        }
    }
}
