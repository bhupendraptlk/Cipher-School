import java.util.ArrayList;

//Using ArrayList
public class arrayListImp {
    public static void main(String[] args) {
        ArrayList<String> cart = new ArrayList<String>();
        System.out.println("Total product count in cart : "+cart.size());
        //Adding elements
        cart.add("macBook");
        cart.add("Iphone");
        cart.add("Charger");
        cart.add("DSLR");
        System.out.println("Total product count in cart : "+cart.size());

        //Removing Elements
        cart.remove("Charger"); //or cart.remove(2)
        System.out.println(cart);
        System.out.println("Total product count in cart : "+cart.size());

        //Enhanced For Loop
        for(String product : cart){
            System.out.println("You added : "+product);
        }
    }
}
