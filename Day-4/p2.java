import java.util.Scanner;
//Bhupendra Patel
public class p2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp=n;
        int count=0;
        while(temp!=0){
            if(temp%10!=0){
                count++;
            }
            temp=temp/10;
        }
        System.out.println(count);
    }
}
