import java.util.Stack;
//import java.util.*;

public class StackCollectionFramework {
    
    static Stack<Integer> s= new Stack<>();

    public static boolean isEmpty(){
        return s.size()==0; 
    }
    
    public static void main(String[] args) {
        
    s.push(5);
    s.push(6);
    s.push(7);
    s.push(8);
    s.pop();

    while(!s.isEmpty()){
        System.out.println(s.peek());
        s.pop();
    }

    }
}
