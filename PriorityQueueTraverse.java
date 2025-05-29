import java.util.PriorityQueue;
import java.util.Iterator;
public class PriorityQueueTraverse {
    public static void main(String[] args) {
        PriorityQueue<String> queue= new PriorityQueue<>();
        queue.add("Amit");
        queue.add("Shubham");
        queue.add("Zyan");
        queue.add("Don");
        queue.add("Bom");
        queue.add("Jayesh");

//Here According to the Priority The Amit and Bom Gets Execute First in the Queue.

        System.out.println("Before Removing: ");
        Iterator<String> itr= queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println();
        System.out.println("After Removing: ");

        queue.poll();
        queue.remove();
        for(String str: queue){
            System.out.println(str);
        }
    
    }
}
