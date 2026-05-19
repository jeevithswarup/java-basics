
public class CreationLL {

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
    
    public void creation(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    private Node removeHead() {
        if (head == null)
            return head;
        head = head.next;
        if (head == null) {
            head = null;
            tail = null;
        }
        return head;

    }
    
    private Node insertAtPosiNode(int data, int k) {
        Node newNode = new Node(data);

        if (k == 1) {
            newNode.next = head;
            head = newNode;
        }
        if (tail == null) {
            tail = newNode;
        }
        Node temp = head;
        int count = 1;
        while (temp.next != null && count < k - 1) {

            temp = temp.next;
            count++;
        }

        if (temp.next == null) {
            System.out.println("Invalid Location");
        }
        newNode.next = temp.next;
        temp.next = newNode;
        if (newNode.next == null) {
            tail = newNode;
        }
        return head;
    }
    
    private Node removeTail() {

        if (head == null)
            return null;

        Node temp = head;
        if (temp.next == null) {
            head = null;
            tail = null;
        }

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;

        return head;
    }
    


    public void Print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println("NUll");
    }

    public static void main(String[] args) {
        
        CreationLL obj = new CreationLL();
        obj.creation(10);
        obj.creation(20);
        obj.creation(30);
        obj.creation(40);
        obj.Print();
        obj.removeHead();
        obj.Print();
        obj.insertAtPosiNode(55, 3);
        obj.Print();
        obj.removeTail();
        obj.Print();
    }
}
