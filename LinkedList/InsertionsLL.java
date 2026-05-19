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
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }
    
    public Node removeHead() {
        if (head == null)
            return head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return head;

    }

    private void insertAtPosition(int k, int data) {

        Node newnode = new Node(data);

        if (k == 1) {
            newnode.next = head;
            head = newnode;

            if (tail == null) {
                tail = newnode;
            }
            return;
        }

        Node temp = head;
        int count = 1;

        while (temp.next != null && count < k) {
            temp = temp.next;
            count++;
        }

        if (temp == null) {
            System.out.println("invalid Location");
            return;
        }
        newnode.next = temp.next;
        temp.next = newnode;
            if (newnode.next == null) {
        tail = newnode;
    }

    }
     
    

    private Node removeTail() {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            head = null;
            tail = null;
            return head;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        return head;
    }

    private void Print() {
        Node temp = head;
        while (temp!= null) {
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
        obj.insertatend(40);
        obj.Print();     //normal linked list
        obj.removeHead();
        obj.Print(); // Removed Head
        obj.removeTail();
        obj.Print();
        obj.insertAtPosition(3, 99);
        obj.Print();
    }
}
