/*
Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
 An Invoice should include four pieces of information as instance variables‐a part number(type String)
 ,a part description(type String),a quantity of the item being purchased (type int) and a price per item (double).
 Your class should have a constructor that initializes the four instance variables.
 Provide a set and a get method for each instance variable. In addition, provide a method named getInvoice Amount that
 calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value.
 If the quantity is not positive, it should be set to 0. If the price per item is not positive,
 it should be set to 0.0. Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities.
 */

import java.util.Scanner;

class Invoice{
    String partNumber;
    String partDescription;
    int quantity;
    double price;
    public Invoice(String pn,String pd,int q,double p){
        this.partNumber=pn;
        this.partDescription=pd;
        setQuantity(q);
        setPrice(p);
    }
    public void setPartNumber(String pn){
        partNumber=pn;
    }
    public void setPartDescription(String pd){
        partDescription=pd;
    }
    public void setQuantity(int q){
        if(q>0){
            quantity=q;
        }
        else this.quantity=0;
    }
    public void setPrice(double p){
        if(p>0){
            price=p;
        }
        else price=0.0;
    }
    public String getPartNumber(){
     return partNumber;
    }
    public String getPartDescription(){
        return partDescription;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPrice(){
        return price;
    }
    public double getInvoiceAmount(){
        return (quantity*price);
    }
}
public class p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Invoice ob = new Invoice("B08","Brake",2,1000);
        System.out.println("Enter your choice : 1-Get Invoice; 2-Get info, 3-Change info");
        int choice = scan.nextInt();
        switch(choice){
            case 1:
                System.out.println("The total amount is : "+ob.getInvoiceAmount());
                break;
            case 2:
                System.out.println("Enter what info you would like to get: 1-Part Number;2-Part description;3-quantity;4-price");
                int info = scan.nextInt();
                switch(info){
                    case 1:
                        System.out.println(ob.getPartNumber());
                        break;
                    case 2:
                        System.out.println(ob.getPartDescription());
                        break;
                    case 3:
                        System.out.println(ob.getQuantity());
                        break;
                    case 4:
                        System.out.println(ob.getPrice());
                        break;
                }
                break;
            case 3:
                System.out.println("Enter what info you would like to change: 1-Part Number;2-Part description;3-quantity;4-price");
                int setInfo=scan.nextInt();
                switch(setInfo){
                    case 1:
                        System.out.println("Enter new part number");
                        ob.setPartNumber(scan.next());
                        System.out.println("The new part number is : "+ob.getPartNumber());
                        break;
                    case 2:
                        System.out.println("Enter new part description");
                        ob.setPartDescription(scan.next());
                        System.out.println("The new part description is : "+ob.getPartDescription());
                        break;
                    case 3:
                        System.out.println("Enter new quantity");
                        ob.setQuantity(scan.nextInt());
                        System.out.println("The new quantity is : "+ob.getQuantity());
                        break;
                    case 4:
                        System.out.println("Enter new price");
                        ob.setPrice(scan.nextDouble());
                        System.out.println("The new price is : "+ob.getPrice());
                        break;
                }
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}
