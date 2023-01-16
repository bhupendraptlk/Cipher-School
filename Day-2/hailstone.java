//Bhupendra Patel
public class hailstone {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Enter a number");
        int n =scan.nextInt();
        System.out.print(n);
        while(n!=1){
            if(n%2==0){
                n/=2;
                System.out.print("-"+n);
            }
            else{
                n=(n*3)+1;
                System.out.print("-"+n);
            }
        }
    }
}
