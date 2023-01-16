import java.util.Scanner;
/*
Divisibility check
Description
Given an integer ‘n’, your task is to write a Python code to find whether ‘n’ is divisible by all its digits or not. If they divide the number, then the number ‘n’ is a happy number. Otherwise, it is a sad number.
The number ‘n’ may be provided with commas. At first, you have to clean the number (by removing the commas involved) and then check whether the number is happy or sad.
---------------------------------------------------------------------------------------------------

Input - String
Output - String

---------------------------------------------------------------------------------------------------
Sample Input - 2,128
Sample Output - Happy Number

---------------------------------------------------------------------------------------------------

Sample Input - 256
Sample Output - Sad Number

 */
//Bhupendra Patel
public class happyNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inp = scan.next();
        String str = new String();
        for(int i=0;i<inp.length();i++){
            if(inp.charAt(i) !=','){
                str+=inp.charAt(i);
            }
        }
        int no=Integer.parseInt(str);
        int temp = no;
        while(temp>0){
            if((no%(temp%10))==0){
                temp=temp/10;
                continue;
            }
            else{
                System.out.println("Sad number");
                return;
            }
        }
        System.out.println("Happy number");
    }
}
