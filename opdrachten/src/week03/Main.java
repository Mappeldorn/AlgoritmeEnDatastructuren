package week03;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(tree.head,2);
        System.out.println("Building tree with root value " + tree.head.data);
        tree.insert(tree.head,3);
        tree.insert(tree.head, 5);
        tree.insert(tree.head, 25);
        tree.insert(tree.head, 34);
        tree.insert(tree.head, 69);

    }
}
