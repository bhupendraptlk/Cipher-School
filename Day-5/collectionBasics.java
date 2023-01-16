import java.util.ArrayList;

public class collectionBasics {
    public static void main(String[] args) {
        ArrayList grocery = new ArrayList(); //Example of Non-Generic Data Structure
        grocery.add("milk");
        grocery.add(10);
        grocery.add(1.24);
        grocery.add(true);
        grocery.add('B');

        ArrayList<Integer> grocery1 = new ArrayList<Integer>(); //Ecample of Generic Data Structure that stores only Integer type of values
        grocery1.add(8);
        //grocery1.add("hehe"); //This line will give an error
    }
}
