import java.util.Scanner;
//Bhupendra Patel
public class D3p1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.next();
        String newSt = new String();
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                newSt+=Character.toUpperCase(str.charAt(i));
            }
            else if(Character.isUpperCase(str.charAt(i))) {
                newSt += Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.println(newSt);
    }
}
