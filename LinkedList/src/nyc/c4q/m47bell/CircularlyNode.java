package nyc.c4q.m47bell;

/**
 * Created by c4q-marbella on 11/3/15.
 * Access Code 2-1
 * Marbella Vidals
 */
public class CircularlyNode {

    CircularlyNode next;
    String data;

    public CircularlyNode(String data) {
        this.data = data;
    }
}

class CircularList {
    CircularlyNode head;


    public void print() {
        CircularlyNode current = head;

        while (current!= null) {
            System.out.print(current.data + ",");
            current = current.next;
        }
        System.out.println();
    }

    public void addToHead(String data) {
        CircularlyNode newNode = new CircularlyNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void addToTail(String data){
        CircularlyNode newNode = new CircularlyNode(data);
        //dont want to move head here
       CircularlyNode current = head;
        while (current.next !=null){
            current = current.next;
        }
        current.next = newNode;
    }



    public void insertAfter(String prevData, String newData){

        CircularlyNode current = head;

        //traverse through list
        //need reference of last node
        while(current != null && !current.data.equals(prevData)){
            current = current.next;
        }

        if (current != null){
            //then we know current is pointing to the node after
            //which we add 'newData'
           CircularlyNode newCircNode = new CircularlyNode(newData);
            newCircNode.next = current.next;
            current.next = newCircNode;
        }

    }
}



