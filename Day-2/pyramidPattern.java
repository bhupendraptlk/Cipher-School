import java.util.Scanner;
/*
     *
    *_*
   *_*_*
  *_*_*_*
 *_*_*_*_*

 */
//Bhupendra Patel
public class pyramidPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int rows=0;rows<n;rows++){
            for(int colSpace=n-rows;colSpace>1;colSpace--) {
                System.out.print(" ");
            }
            for(int colStar=0;colStar<=rows;colStar++){
                if(colStar==rows){
                    System.out.print("*");
                }
                else{
                    System.out.print("*_");
                }
            }
            System.out.println();
        }
    }
}
