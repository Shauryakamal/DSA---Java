package LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    Node head;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void deleteFirst(int data) {
        if (head == null) {
            return;
        }

        // delete head
        if (head.data == data) {
            head = head.next;
        }
        //find previous node 

        Node current = head;
        while(current.next != null && current.next.data != data){
            current = current.next;
        }

        //delete node 
        if(current.next != null){
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.deleteFirst(30);
        list.printList();
        
    }
}
