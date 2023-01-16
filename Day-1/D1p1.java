/*
Ques:1
        Write A program to accept  Four digit number from user and count zero ,
        odd and even digits from the entered number.
*/
package training;

import java.util.Scanner;

//Bhupendra Patel
public class D1p1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a four digit number");
        int n = scan.nextInt();
        int even=0,odd=0,zero=0;
        if(n >9999){
            System.out.println("Only four digit numbers allowed");
        }
        else{
            while(n!=0){
                int rem = n%10;
                n=n/10;
                if(rem==0){
                    zero++;
                }
                else if(rem%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            System.out.println("0 : "+zero);
            System.out.println("even : "+even);
            System.out.println("odd : "+odd);
        }
    }
}
