import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
public class MapCF {
    public static void main(String[] args) {
        Map<Integer, String> mp= new HashMap<Integer, String>();       
        mp.put(101, "Tommy");
        mp.put(201, "Billie");
        mp.put(301, "Addie");
        mp.put(601, "John");
        mp.put(501, "Sunil");


        for(Map.Entry ms: mp.entrySet()){
            System.out.println(ms.getKey() + " " + ms.getValue());
        }

        System.out.println();

//Converting to Set so that we can traverse  

        Set st= mp.entrySet();
        
        Iterator itr= st.iterator();

        while(itr.hasNext()){
        //Converting to Map.Entry so that we can get key and value separately 
            Map.Entry entry= (Map.Entry)itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
