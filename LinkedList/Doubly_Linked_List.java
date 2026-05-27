
public class Doubly_Linked_List {
    
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }

        Node(int data, Node next, Node prev) {
            this.data = data;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + "---------->");
            head = head.next;
        }
        System.out.println();

    }

    private static Node deleteTail(Node head) {
         if (head == null || head.next == null) {
                return null;
            }
        Node tail = head;

        while (tail.next != null) {
            tail = tail.next;
        }
        Node back = tail.prev;
        back.next = null;
        tail.prev = null;

        return head;
    }

    private static Node convertArr2DLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node prev   = head;
        for  (int  i  =   1 ; i < arr.length; i++) {
            Node temp = new Node(arr[i], null, prev);
            prev.next   = temp;
            prev   = prev.next;
        }
        return head;
    }
    
    private static Node deleteHead(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        Node prev = head;
        head = head.next;
        head.prev=null;
        prev.next=null;
        return head;
        
       }
   


       public static void main(String[] args) {
        Doubly_Linked_List obj = new Doubly_Linked_List();
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        Node head=convertArr2DLL(arr);
        obj.print(head);
    }

}
