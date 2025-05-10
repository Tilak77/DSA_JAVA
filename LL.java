public class LL {
    Node head;  //Here we Declared "head" as a Node, Head is refer to First Node of LL.

    class Node{
        
        String data;    //Each Node will Conatin One String type Data.
        Node next;      //And a pointer which points to Next Node.

        Node(String data){       //Constructor 
            this.data=data;
            this.next=null;
        }
    }



    //To Add the Node from the First or Starting.
    public void addFirst(String data){
        Node newNode= new Node(data);    // Here we Create a New Node in LL.
        if(head == null){       //Checks if any LinkedList Exists?
            head= newNode;      //If not exist then makes the New Node the Head.
            return;
        }
                            //If any Node already exists then,
        newNode.next= head;    //Makes the Next of NewNode "Head".
        head= newNode;         // And then the New Node becomes the "Head".
    }


    //To Add the Node from the Last or Ending.
    public void addLast(String data){
        Node newNode= new Node(data);
        if(head==null){
            head= newNode;
            return;
        }

        Node currNode= head;       //We took New currNode as Head, so that we can perform operations on Head Indirectly.
        while(currNode.next != null){   //We have to Traverse till the Next of the currNode in Null.
            currNode= currNode.next;    //Traversing or Travelling towards the End of the LL.
        }
        currNode.next= newNode;      //If next node is Null then Current Node will Points towards the New Node we created.
                                     // Or to Insert the Node at the End.
    }

    //To Print the LinkList
    public void printList(){
        if(head== null){          //Checks if LL is Empty or Not.
            System.out.println("The LL is Empty");
            return;
        }

        Node currNode= head;
        while(currNode != null){     //Here we Traverse or Travel to All Nodes from Head to End
            System.out.print(currNode.data + " -> ");   //Here we Print the Data of Each Node.
            currNode= currNode.next;
        }
        System.out.println("NULL");   //End is NULL
    }


    //To Delete a Node from First or Starting.
    public void deleteFirst(){
        if(head == null){         // Checks if LL is Empty of Not.
            System.out.println("The LL is Empty");
            return;
        }

        head= head.next;   //If we assign the Head to the Second Node then the First Node will not be Considered in LL.
        
    }    

    //To Delete a Node from Last or Ending.
    public void deleteLast(){
        if(head== null){
            System.out.println("The LL is Empty");
            return;
        }
            // These Both are Corner Cases, Mostly used to pass Test Cases.
        if(head.next== null){
            head=null;     //Checks if there is Only One node in LL, then Removes that one also.
            return;
        }

        Node currNode = head;
        while(currNode.next.next != null){      // If the Next of Next of CurrNode is NULL then, the Next of CurrNode will Become NULLL.
            currNode= currNode.next;
        }
        currNode.next=null;
    }

    public static void main(String[] args) {
        
        LL list= new LL();     // We have Created Obejct named "list".
        list.addFirst("is");
        list.addFirst("this");
        list.printList(); 

        list.addFirst("Hello");
        list.addLast("LinkedList");
        list.printList();

        // list.deleteFirst();
        list.deleteLast();
        list.printList();
    }
}
