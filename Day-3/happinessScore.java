import java.util.Locale;
import java.util.Scanner;

public class happinessScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.next().toLowerCase();
//        char[] chars = name.toCharArray();
        int happiness=0;
//        for(int i : chars){
//            happiness+=i;
//        }
        for(char n : name.toCharArray()){
            happiness+=n;
        }
        System.out.println(happiness);
    }
}
