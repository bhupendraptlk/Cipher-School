import java.util.Scanner;

/*
Ques:4
Write a   program to accept ‘n’ numbers from user , store these numbers into an array
and sort the numbers of an array using function.

 */
public class D1p4 {
    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers?");
        n = scan.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scan.nextInt();
        }
    }
}
