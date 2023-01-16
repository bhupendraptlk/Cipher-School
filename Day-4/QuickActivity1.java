import java.util.Scanner;

public class QuickActivity1 {
    public static void main(String[] args) {
        int a1[][] = {
                {1,2},
                {3,4}
        };
        int a2[][] = {
                {5,6},
                {7,8}
        };
//        int prodArr[][] = new int[4][4];
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(a1[i][j]*a2[i][j]+"\t");
            }
            System.out.println();
        }
//        for(int i=0;i<2;i++){
//            for(int j=0;j<2;j++){
//                System.out.print(prodArr[i][j]);
//            }
//            System.out.println();
//        }
    }
}
