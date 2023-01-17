import java.util.*;
//HashMap is Unordered : Does not maintain order
public class hashMapImp {
    public static void main(String[] args) {
        //A map interface {Key:Value}
        //A map interface contains the data as a Key:Value pair
        Map<String,String> states = new HashMap<String, String>();
        states.put("AL","Alabama");
        states.put("CA","California");
        states.put("NY","New York");
        states.put("TX","Texas");
        System.out.println(states);
        for(Map.Entry<String,String> pair : states.entrySet()){
            System.out.println(pair.getKey()+" : "+pair.getValue());
        }
    }
}
