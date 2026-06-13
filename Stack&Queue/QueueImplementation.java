
public class QueueImplementation {

    int queue = 10;
    int[] Queue = new int[queue];

    int start = -1;
    int end = -1;

    void push(int n) {

        if (end == queue - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        if (start == -1) {
            start = 0;
            end = 0;
        } else {
            end++;
        }

        Queue[end] = n;
    }

    void pop() {

        if (start == -1) {
            System.out.println("Queue is Empty");
            return;
        }

        if (start == end) {
            start = -1;
            end = -1;
        } else {
            start++;
        }
    }

    public int top() {

        if (start == -1) {
            return -1;
        }

        return Queue[start];
    }

    public int size() {

        if (start == -1) {
            return 0;
        }

        return end - start + 1;
    }

    public static void main(String[] args) {

        QueueImplementation obj = new QueueImplementation();

        obj.push(10);
        obj.push(20);
        obj.push(30);

        System.out.println(obj.top());   // 10
        System.out.println(obj.size());  // 3

        obj.pop();

        System.out.println(obj.top());   // 20
        System.out.println(obj.size());  // 2
    }
}