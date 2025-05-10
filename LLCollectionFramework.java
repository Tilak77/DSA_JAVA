import java.util.*;
//import java.util.LinkedList;
// or import java.util.LinkedList, but the " * " Imports Every Packages;

public class LLCollectionFramework {
    public static void main(String[] args) {
        LinkedList<String> list= new LinkedList<String>();

        list.add("This");
        list.add("is");
        list.add("a");
        list.add("Linked List");  
        list.addFirst("Hello");  
        list.addLast("Java");
        list.removeLast();
        
        System.out.println(list);
        System.out.println(list.get(4));
    }
}
