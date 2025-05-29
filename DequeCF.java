import java.util.ArrayDeque;
import java.util.Deque;
public class DequeCF {
    public static void main(String[] args) {

// Deque is used as Queue but in this we Can Create or Delete form Both the Ends of the Queue.

        //ArrayDeque provides facility of using deque and resizable-array.
        Deque<String> dq= new ArrayDeque<String>();
        dq.add("Amit");
        dq.add("Zyan");
        dq.add("Tilak");
        dq.add("Holly");
        dq.add("Billy");

        dq.offerFirst("Tommy");
        dq.offerLast("Mike");
        
        //The offerFirst() is used to add Element at the Top or to give the Priority to a Specific Element.
        //The offerLast() is used to add Element at the last, similar like .add().
        for(String str: dq){
            System.out.println(str);
        }

        System.out.println();

        //To Remove form Top or Head.
        dq.remove();
        // The pollLast() is used to Remove Element form the Last.
        //The pollFirst() is the Same as poll().
        dq.pollLast();

        for(String str: dq){
            System.out.println(str);
        }

    }
}
