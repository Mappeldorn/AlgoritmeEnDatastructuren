package week03;

public class BinaryTree<E> {
    Node head;
    public void insert(Node current, E data){

        if(head == null){
            head = new Node(data);
            return;
        }

        if(current.left == null){
            current.left = new Node(data);
            System.out.println("Inserted " + data + " to left of Node " + current.data);
        }else if(current.right == null ){
            current.right = new Node(data);
            System.out.println("Inserted " + data + " to right of Node " + current.data);
        }else{
            insert(current.right, data);
        }

    }
}
