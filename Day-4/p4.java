//incomplete
import java.util.Scanner;
//Bhupendra Patel
public class p4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int start=0;
        int end = n-1;
        int flag = 0;
        if(arr[0]>arr[n-1]){
            flag=arr[0];
            start=1;
        }
        else{
            flag=arr[n-1];
            end=n-2;
        }
        while(start!=end){
            if(flag>arr[start] & flag>arr[end]){
                flag=Math.max(arr[start],arr[end]);
                System.out.println("Possible");
            }
            else{
                System.out.println("Impossible");
            }
        }

    }
}
