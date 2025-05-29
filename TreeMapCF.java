import java.util.TreeMap;
import java.util.Map;

public class TreeMapCF {
    public static void main(String[] args) {


//The TreeMap is same as HashMap but it Stores Elements in Ascending Order.
//HashMap can contain One Null Value, but TreeMap can not Store Any Null key.
        TreeMap<Integer, String> tm= new TreeMap<>();
        tm.put(104, "James");
        tm.put(105, "Jerry");
        tm.put(101, "Tom");
        tm.put(103, "Robert");
        tm.put(102, "Aston");
        tm.put(109, "David");

        System.out.println(tm);

        tm.remove(102);
        for(Map.Entry en : tm.entrySet()){
            System.out.println(en.getKey() + " " + en.getValue());

        }


    }
}
