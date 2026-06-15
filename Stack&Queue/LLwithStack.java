public class LLwithStack {

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    Node top = null;
    int size = 0;

    void pushNode(int x) {
        Node temp = new Node(x);
        temp.next = top;
        top = temp;
        size++;
    }

    void popNode() {

        if (top == null) {
            System.out.println("Stack Empty");
            return;
        }

        top = top.next;
        size--;
    }

    int topNode() {

        if (top == null) {
            return -1;
        }

        return top.val;
    }

    int LLsize() {
        return size;
    }

    public static void main(String[] args) {

        LLwithStack obj = new LLwithStack();

        obj.pushNode(10);
        obj.pushNode(20);
        obj.pushNode(30);

        System.out.println("Top: " + obj.topNode()); 
        System.out.println("Size: " + obj.LLsize()); 

        obj.popNode();

        System.out.println("Top: " + obj.topNode()); 
        System.out.println("Size: " + obj.LLsize()); 
    }
}