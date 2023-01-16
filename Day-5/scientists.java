import java.util.*;

public class scientists {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> name = new ArrayList<String>();
        for(int i=1;i<4;i++){
            name.add(scan.nextLine());
        }
        Iterator<String> sci = name.iterator();
        while(sci.hasNext()) {
            String[] sName = sci.next().split(" ");
            System.out.println("Dear Mr. "+sName[sName.length-1]+"."+sName[0].charAt((0)));
        }
    }
}
