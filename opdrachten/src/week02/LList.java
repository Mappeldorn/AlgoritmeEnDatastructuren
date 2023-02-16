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

        //check of de voorste node de laatste is
        if(head == null){
            head = newHead;
            return;
        }

        Node temp = head;

        while (temp.next != null){
            temp = temp.next;
        }

        temp.next = newHead;

    }

    public int peak(){
        if(head == null){
            return 0;
        }
        return (int) head.data;
    }

    public int getCount(){
        //check of list leeg is
        if (head == null){
            return 0;
        }

        Node tmp = head;
        int counter = 0;

        //loop door alle nodes
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
