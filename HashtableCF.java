import java.util.Hashtable;

public class HashtableCF {
    public static void main(String[] args) {


// A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
// It contains only unique elements.
// It may have not have any null key or value.
// It is synchronized.

        Hashtable<Integer, String> ht= new Hashtable<>();

        ht.put(104, "James");
        ht.put(105, "Jerry");
        ht.put(101, "Tom");
        ht.put(103, "Robert");
        ht.put(102, "Aston");
        ht.put(109, "David");

        ht.remove(103);
        System.out.println(ht);

    }
}
