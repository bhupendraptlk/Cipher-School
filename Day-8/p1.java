import java.text.DecimalFormat;
import java.util.Scanner;
/*
Write a Java application that allows the user to enter up to 20 integer grades into an array.
Stop the loop by typing in ‐1. Your main method should call an Average method
that returns the average of the grades. Use the DecimalFormat class to format the average to 2 decimal places
 */
//Bhupendra Patel
public class p1 {
    public double Average(double arr[],int length){
        double sum = 0;
        for(int i=0;i<length;i++){
            sum+=arr[i];
        }
        return (sum/length);
    }
    public DecimalFormat df= new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        p1 ob =new p1();
        System.out.println("Enter 20 grades");
        double[] grades = new double[20];
        int length = 0;
        for(int i=0;i<20;i++){
            double val = scan.nextDouble();
            if(val!=-1){
                grades[i]=scan.nextDouble();
                length++;
            }
            else{
                break;
            }
        }
        System.out.println(ob.df.format(ob.Average(grades,length)));
    }
}
