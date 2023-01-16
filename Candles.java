import java.util.Scanner;

public class Candles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter how many candles");
        int n = scan.nextInt();
        int[] candles = new int[n];
        int max=0,count=0;
        System.out.println("Enter heights");
        for(int i=0;i<n;i++){
            candles[i]=scan.nextInt();
            if(candles[i]>max){
                max=candles[i];
                count=0;
            }
            if(max==candles[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
