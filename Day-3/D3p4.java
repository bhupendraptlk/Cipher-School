import java.util.*;
//Bhupendra Patel
public class D3p4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Round 1 passed (Comma separated ) : ");
        String r1 = scan.nextLine();
        System.out.println("Round 2 passed (Comma separated ) : ");
        String r2 = scan.nextLine();
        System.out.println("Round 3 passed (Comma separated ) : ");
        String r3 = scan.nextLine();
        String[] s1 = r1.trim().split(",");
        String[] s2 = r2.trim().split(",");
        String[] s3 = r3.trim().split(",");
        String str = new String();
        for(int i=0;i<s1.length;i++){
            for(int j=0;j<s2.length;j++){
                if(s1[i].equalsIgnoreCase(s2[j])){
                    for(int k=0;k<s3.length;k++){
                        if(s2[j].equalsIgnoreCase(s3[k])){
                            str+=s3[k]+" ";
                        }
                    }
                }
            }
        }
        System.out.println(str.toLowerCase());
    }
}