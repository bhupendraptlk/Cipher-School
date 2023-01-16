import java.util.*;
//Bhupendra Patel
public class p3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        int build[][] = new int[rows][cols];
        int height[] = new int[cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                build[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<cols;i++){
            for(int j=0;j<rows;j++){
                height[i]+=build[j][i];
            }
        }
        Arrays.sort(height);
        System.out.println(height[cols-1]);
    }
}
