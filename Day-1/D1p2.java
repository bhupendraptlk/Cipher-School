package training;
import java.util.Scanner;
/*
Write a    program to accept ‘n’ numbers from user ,
store these numbers into an array. Find out maximum and minimum number from an Array.
 */
//Bhupendra Patel
public class D1p2 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many number you want to enter");
        n = scan.nextInt();
        System.out.println("Enter the numbers");
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
        int max=arr[0];
        int min =arr[0];
        for(int i=0;i<n;i++) {
            max=Math.max(arr[i],max);
            min=Math.min(arr[i],min);
        }
        System.out.println("Max : "+max);
        System.out.println("Min : "+min);
    }
}
