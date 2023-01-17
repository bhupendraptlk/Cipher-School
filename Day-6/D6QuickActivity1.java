import java.util.*;

//Write a java program to form a keyVAlue pair from the string below
//prescription:"Sun Kiwi,Mon Apple, Tue Guava, wed Grapes, Thu Mango"
//{key:value}={day:fruit}
public class D6QuickActivity1 {
    public static void main(String[] args) {
        Map<String,String> prescriptionList = new LinkedHashMap<String,String>();
        String prescription="Sun Kiwi,Mon Apple,Tue Guava,Wed Grapes,Thu Mango";
        String[] pres = prescription.split(",");
        for(int i=0;i<pres.length;i++){
            String[] df = pres[i].split(" ");
            prescriptionList.put(df[0],df[1]);
        }
        System.out.println(prescriptionList);
    }
}
