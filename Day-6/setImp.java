//Set interface represents Unordered collection of elements(Doesn't maintain the order of elements in which
// the elements have been entered
//Set interface doesn't allow  duplicates
//Set is implemented using classes like HashSet, LinkedHashSet and TreeSet

import java.util.*;

public class setImp {
    public static void main(String[] args) {
        HashSet<String> products = new HashSet<>();
        products.add("Coffee");
        products.add("Coffee");
        products.add("Tea");
        products.add("Coffee");
        products.add("Appy");
        products.add("Beer");
        System.out.println(products);

        //Characteristics of LinkedHashMap:
            //it contains unique elements
            //it is non synchronized
            //it maintains the insertion order
            //it is internally implemented using linkedList

        //LinkedHashSet has better performance to access the elements from the head
        LinkedHashSet<String> products1 = new LinkedHashSet<>();
        products1.add("Coffee");
        products1.add("Coffee");
        products1.add("Tea");
        products1.add("tea");
        products1.add("Appy");
        products1.add("appy");
        products1.add("Coffee");
        products1.add("Beer");
        System.out.println(products1);
        //LinkedHashSet uses LinkedList class internally to store elements


        //TreeSet has better performance than HashSet and LinkedHashSet
        //TreeSet is Sorted( ASCII)
        TreeSet<String> products2 = new TreeSet<>();
        products2.add("Coffee");
        products2.add("Coffee");
        products2.add("Tea");
        products2.add("tea");
        products2.add("Appy");
        products2.add("appy");
        products2.add("Coffee");
        products2.add("Beer");
        System.out.println(products2);

    }
}
