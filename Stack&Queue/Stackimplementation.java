
import java.util.Scanner;


public class Stackimplementation {
        int stack = 10;
        int[] arr = new int[stack];
        int top = -1;

        public void push(int n) {
            top = top + 1;
            if (top >= stack) {
                System.out.println("Out Of bound");
            } else {
                arr[top] = n;
            }
        }
        public int pop() {
            if (top == -1) {
                return -1;
            }
            int val = arr[top];
            top--;
            return val;   
        }

        public int size() {
            return top + 1;
        }
        public int top() {
            if (top == -1) {
                return -1;
            }
            return arr[top];
        }
    




    public static void main(String[] args) {
        Stackimplementation obj = new Stackimplementation();
        Scanner sc = new Scanner(System.in);
       
        int n = sc.nextInt();
        obj.push(n);
        obj.pop();
        obj.top();
        obj.size();
        sc.close();
    }
}
