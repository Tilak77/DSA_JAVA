import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetCF {
    public static void main(String[] args) {


// The TreeSet used Tree structure for Storage, which stores value sets in an Ascending Order.

        TreeSet<Integer> ts= new TreeSet<Integer>();        
        ts.add(5);
        ts.add(9);
        ts.add(3);
        ts.add(1);
        ts.add(8);
        ts.add(6);

        TreeSet<String> ts2= new TreeSet<String>();
        ts2.add("Tommy");
        ts2.add("Addie");
        ts2.add("Cobby");
        ts2.add("Holly");
        ts2.add("Billie");
        ts2.add("Hoddie");

        Iterator<Integer> itr= ts.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();

        Iterator<String> itr2= ts2.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
