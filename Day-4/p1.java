import java.util.*;
//Bhupendra Patel
public class p1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        if(arr.length<3){
            System.out.println("The array doesn't have a third maximum element");
            return;
        }
        int flag=0;
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
            if(i>=2){
                if(arr[i-1]!=arr[i-2] & arr[i-2]!=arr[i]){
                    flag++;
                }
            }
        }
        if(flag<3){
            System.out.println("The array doesn't have a third maximum element");
            return;
        }
        Arrays.sort(arr);
        System.out.println(arr[n-3]);
    }
}
