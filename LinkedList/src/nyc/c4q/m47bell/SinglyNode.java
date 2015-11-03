package nyc.c4q.m47bell;

public class SinglyNode {

    SinglyNode next;
    String data;

    public SinglyNode(String data) {
        this.data = data;
    }

}

class SinglyList {
    SinglyNode head;

    //can have duplicates
    public void addToHead(String data){
        SinglyNode newNode = new SinglyNode(data);
        //should you move the head first or null pointer first?
        //dont move the head first before assigning a new list,
        //it will garbage collect it and destroy ur list.
        newNode.next = head;
        // don't do newNode = head bc then you remove your reference of new node..
        //You want to move head reference so you do head = newNode;
        head = newNode;
    }

    public void addToTail(String data){
        SinglyNode newNode = new SinglyNode(data);
        //dont want to move head here
        SinglyNode current = head;
        while (current.next !=null){
            current = current.next;
        }
        current.next = newNode;

    }

    public void insertAfter(String prevData, String newData){

        SinglyNode current = head;

        //traverse through list
        //need reference of last node
        while(current != null && !current.data.equals(prevData)){
            current = current.next;
        }

        if (current != null){
            //then we know current is pointing to the node after
            //which we add 'newData'
            SinglyNode newSinglyNode = new SinglyNode(newData);
            newSinglyNode.next = current.next;
            current.next = newSinglyNode;
        }

    }

    public void find(){
//        find(this.head);
    }

    public void find(SinglyList node){
        if(node==null)return;

//        find(node.next);

    }

    public void print() {
        SinglyNode current = head;

        while (current!= null) {
            System.out.print(current.data + ",");
            current = current.next;
        }
        System.out.println();
    }

    public void update(String oldData, String newData){
        SinglyNode current = head;
        while(current !=null && !current.data.equals(oldData)){
            current = current.next;
        }
        if(current!=null) {
            current.data = newData;
        }
    }

    public void delete (String data){
       //if list is empty
        if(head == null){
            return;
        }
        //where an item you want to delete is one element
        if(head.data.equals(data)){
            head = head.next;
        }

        SinglyNode prevNode = head;
        while(prevNode.next !=null && !prevNode.next.data.equals(data)){
            prevNode = prevNode.next;
        }
        if(prevNode.next != null){
            prevNode.next = prevNode.next.next;
        }

    }
}


//class Main {
//
//    public static void main(String[] args) {
//        SinglyList list = new SinglyList();
//        list.print();
//        list.addToHead("testing123");
//        list.print();
//        list.addToHead("one");
//        list.print();
//        list.addToTail("tail");
//        list.print();
//        list.addToTail("tail2");
//        list.update("tail2", "tail3");
//        list.print();
//
//
//        //Testing if it will crash if its empty
//
//        SinglyList list2 = new SinglyList();
//        list2.insertAfter("foo", "bar");
//        list2.print();
//
//
//    }
//}
