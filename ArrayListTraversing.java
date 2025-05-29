import java.util.ArrayList;
import java.util.ListIterator;
public class ArrayListTraversing {
    public static void main(String[] args) {
        ArrayList<Integer> arrlst= new ArrayList<Integer>();
        arrlst.add(1);
        arrlst.add(2);
        arrlst.add(3);
        arrlst.add(4);
        arrlst.add(5);
        arrlst.add(6);
        arrlst.add(7);
        arrlst.add(8);

        // for(int i:arrlst){
        //     System.out.println(i);
        // }

        ListIterator<Integer> itr= arrlst.listIterator();   
        while(itr.hasNext()){ 
            System.out.println(itr.next());
        }
        System.out.println();

        while(itr.hasPrevious()){
            System.out.println(itr.previous());
        }
    }
}
