public class InsertionsLL {
    


    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;
    Node tail;

    public void insertatend(int data) {
        Node newnode = new Node(data);

        if (head == null) {
            head = newnode;
            tail = newnode;
        }
        else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    private void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "---->");
            temp = temp.next;
        }
        System.out.println("Null");
    }
    


    public static void main(String[] args) {
        InsertionsLL obj = new InsertionsLL();
        obj.insertatend(10);
        obj.insertatend(20);
        obj.insertatend(30);
        obj.insertatend(50);
        obj.Print();
    }
}
