//Bhupendra Patel
import java.util.Scanner;
public class D3p5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = scan.next();
        String s1 = new String();
        String s2 = new String();
        for(int i=0;i<str.length();i++){
            if(i%2==0){
                s1+=str.charAt(i);
            }
            else{
                s2+=str.charAt(i);
            }
        }
        System.out.print(s1+","+s2);
    }
}
