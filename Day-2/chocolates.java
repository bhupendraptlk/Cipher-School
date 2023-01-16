import java.util.Scanner;
//Bhupendra Patel
public class chocolates {
    public static void main(String[] args) {
        chocolates ob =new chocolates();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of m and c");
        int m=scan.nextInt();
        int c=scan.nextInt();
        int calc=0,free=0,total=0;
        calc = m/c;
        int left = calc %3;
        free = calc/3;
        int extra = (left+free)/3;
        if(extra!=0){
            total=calc+free+extra;
        }
        else{
            total=calc+free+left;
        }
        while(extra>=3){
            extra=extra/3;
            total+=extra;
        }
        System.out.println(total);
    }
}
