import java.util.*;

//Characteristics of TreeMap
//it contains unique elements
//TreeMap maintains the ascending order
//it is non synchronized
public class treeMapImp {
    public static void main(String[] args) {
        TreeMap<String,String> states = new TreeMap<String, String>();
        states.put("AL","Alabama");
        System.out.println(states);
        states.put("CA","California");
        states.put("NY","New York");
        states.put("TX","Texas");
        System.out.println(states);
        for(Map.Entry<String,String> pair : states.entrySet()){
            System.out.println(pair.getKey()+" : "+pair.getValue());
        }
    }
}
