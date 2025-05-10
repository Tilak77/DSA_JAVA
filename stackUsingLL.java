public class stackUsingLL {

    //Making Nodes for Linked list.
    static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            next=null;
        }
    }
    

    //"This is Implementation of Stack Using Linked List."

    static class Stack{
        public static Node head;   //Head will be the Top of the Stack.

        public static boolean isEmpty(){     //Used to Check if Stack is empty?
            return head==null;     //Return True if Stack is Empty otherwise False.
        }

        //To Add an Element in Stack
        public static void push(int data){
            Node newNode= new Node(data);
            if(isEmpty()){
                head= newNode;      //If the Stack is already Empty then the New Node will become the Top/Head. 
                return;
            }
            newNode.next = head;   //If Stack not empty then, the Next of NewNode will become Head,
            head = newNode;        // and then Top/Head position is transfered to the New Node.   
        }

        //To Remove an Element form Stack.
        public static int pop(){
            if(isEmpty()){
                return -1;        //If stack is Empty then return Nothing.
            }
            int top= head.data;   //Here we First make a variable which shows the Data inside Head.
            head= head.next;      //Then we Make the "Next of Head" the "Head".
            return top;           //Then return the Data inside the Head which is on Top.
        }

        //To See the Top of Stack.
        public static int peek(){
            if(isEmpty()){      //If Stack is Empty then Return nothing.
                return -1;
            }
            return head.data;   //Returns the Data inside the Top/Head of the Stack.
        }

    }



    public static void main(String []args){
        Stack s= new Stack();    //Here we called the function and make an Object "s".
        s.push(9);
        s.push(8);
        s.push(7);
        s.push(6);
        s.pop();
        
        while(!s.isEmpty()){       //Until the Stack will not get Empty, it will Run the Loop.
            System.out.println(s.peek());    //Here it is Printing the Top and then Removing the Top, 
            s.pop();                         //which makes the element below it the Top.
        }

    }
}
