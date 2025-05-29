import java.util.HashMap;
public class HashMapCF {
    public static void main(String[] args) {
        HashMap<Integer, String> hm= new HashMap<>();

        hm.put(101, "Tom");
        hm.put(102, "Aston");
        hm.put(103, "Robert");
        hm.put(104, "James");
        hm.put(null, "Ross");

        System.out.println("Before Removing: ");
        System.out.println(hm);

        hm.remove(103);
        System.out.println("After Removing: ");
        System.out.println(hm);


        //LinkedHashMap is Almost same but it only stores Unique Elements.
    }
}
