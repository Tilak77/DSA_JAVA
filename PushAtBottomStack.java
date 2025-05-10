import java.util.*;

public class PushAtBottomStack {
   
    static Stack<Integer> s= new Stack<>();
   
    public static boolean isEmpty(){
            return s.size()==0;         //Returns True if Stack is Empty.
        }

   
    public static void pushAtBottom(int data, Stack<Integer> s){

        if(s.isEmpty()){        //If Stack is already empty then Adds that New Element at Bottom by Default.
            s.push(data);
            return;
        }
        int top= s.pop();         //The variable Top stores the valuse which are "Popped".
        pushAtBottom(data, s);    //("Recursion") Then we Add the New Element in the Empty Stack.
        s.push(top);              //Then we Add the Previously Removed Elements BACK.
    }

    public static void main(String[] args) {
        s.push(1);
        s.push(2);          //First we Add the Elements.
        s.push(3);
        
        pushAtBottom(4, s);     //Using Function call to Perform Operation on "4" given.

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }


    }    
}
