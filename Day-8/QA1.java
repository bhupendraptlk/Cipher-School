import java.util.Scanner;
import java.util.stream.Stream;
//Uncomment the method 1 if you want to use method 1 and comment out method 2 and vice versa
class Products{
    int productId;
    String productName;
    int price;
    String category;
    public Products(int pid,String pName,int price,String category){
        this.productId=pid;
        this.productName=pName;
        this.price=price;
        this.category=category;
    }
    //Mehtod 1:
//    public void print(){
//        System.out.println("The product id is : "+ productId+"; product name is : "+productName+"; product price is : "+price+"; product category is : "+category);
//    }
    //Method 2:
    public String toString(){
        return "The product id is : "+ productId+"; product name is : "+productName+"; product price is : "+price+"; product category is : "+category;
    }
}
public class QA1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Products ob1 = new Products(1,"TheBombayCompany",750,"Perfume");
        Products ob2 = new Products(2,"AXE",300,"Perfume");
        Products ob3 = new Products(3,"WildStone",350,"Perfume");
        Products ob4 = new Products(4,"Realme",4000,"Watch");
        Products ob5 = new Products(5,"Boat",3000,"Watch");
        Stream<Products> prods = Stream.of(ob1,ob2,ob3,ob4);
        System.out.println("Enter a category(Perfume,Watch)");
        String cat = scan.next();
        Stream<Products> filtered = prods.filter(ob->ob.category.toUpperCase().equals(cat.toUpperCase()));
//        filtered.forEach(ob-> ob.print()); //Method 1
        filtered.forEach(ob-> System.out.println(ob.toString())); //Method 2
    }
}
