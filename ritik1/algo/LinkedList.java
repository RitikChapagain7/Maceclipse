package algo;

public class LinkedList {
    //node class --> node bhaneune ho
    public static class Node{
    int data;
    Node next;   //pointer    // data type class nai huncha
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }

 

}

 

public Node head = null;
public Node tail= null;
public void addNode(int data) {
  Node newnode = new Node(data);
    if (head == null) {
        head = newnode;
        tail=head;
    } else {
//        Node current = head;
//        while (current.next != null) {
//            current = current.next;
        
       

 

        tail.next=newnode;
        tail=newnode;
    }
    }
 

 

public void printList() {

 

    Node current = head;

 

    while (current != null) {
        System.out.println(current.data);
        current = current.next;
    }
}

 

public int size() {
    int count = 0;
    Node current = head;
    while (current != null) {
        current = current.next;
        count++;
    }
    return count;
}
public int get(int i) {
    Node current =head;
    if (size()!=0&&i<size()) {
    for (int j=0;j<i;j++) {
        current=current.next;
        
    }
    return current.data;
        
    }
    return -1;
}

 

}