import java.util.ArrayList;
//import java.util.*;

public class stackUsingArrayList {

    static class Stack{
        static ArrayList<Integer> list= new ArrayList<>();

        public static boolean isEmpty(){
            return list.size()==0;
        }

        public static void push(int data){
            list.add(data);     //the add() in ArrayList adds the data in Stack.
        }

        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);    //The get() used to find the Index, Here the Index of Top/Last is found.
            list.remove(list.size()-1);           //Here we Remove the Top using Index.
            return top;                           //Then we Return the Top after Poping.
        }

        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);     //Returns the Top of the Stack.
        }

    }

    public static void main(String args[]){
        Stack stk= new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.pop();

        while(!stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();
        }

    }

}
