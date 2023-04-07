package week02;

public class LList<E> {
    public class Node <E>{
        E data;
        Node next;

        Node(E data){
            this.data = data;
            next = null;
        }
    }

    Node head;

    public void add(E data){
        Node newHead = new Node(data);

        if(head == null){
            head = newHead;
            return;
        }

        Node tmp = head;

        while (tmp.next != null){
            tmp = tmp.next;
        }

        tmp.next = newHead;

    }

    public int peak(){
        if(head == null){
            return 0;
        }
        return (int) head.data;
    }

    public int getCount(){
        if (head == null){
            return 0;
        }

        Node tmp = head;
        int counter = 0;

        while (tmp != null){
            counter++;
            tmp = tmp.next;
        }

        return counter;
    }

    public void print(){
        Node temp = head;

        while (temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
