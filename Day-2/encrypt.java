import java.util.Scanner;
//Bhupendra Patel
public class encrypt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        StringBuilder str = new StringBuilder(scan.next());
        str.reverse();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'){
                str.replace(i,i+1,"0");
            }
            else if(str.charAt(i)=='e'){
                str.replace(i,i+1,"1");
            }
            else if(str.charAt(i)=='i'){
                str.replace(i,i+1,"2");
            }
            else if(str.charAt(i)=='o'){
                str.replace(i,i+1,"3");
            }
            else if(str.charAt(i)=='u'){
                str.replace(i,i+1,"4");
            }
        }
        str.append("aca");
        System.out.println(str);
    }
}
