public class Print_to_N {
    public void print(int n) {
        if (n == 0)
            return;

        print(n - 1);
        System.out.print(n + " ");
         
    }

    public void printreverse(int n) {
        if (n == 0)
            return;

        System.out.print(n + " ");
        printreverse(n - 1);

    }

    public int sum(int n) {
        if (n == 0)
            return 0;

        return n + sum(n - 1);
    }

    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public void ReverseArray(int[] arr,int index) {
       
        if(index==arr.length)
            return;
      
      
        ReverseArray(arr, index + 1);
        System.out.println(arr[index]);
    }

    public static void main(String[] args) {
        Print_to_N obj = new Print_to_N();
        int n = 5;
        int index = 0;
        int[] arr = new int[] { 5, 8, 5, 1, 2 };
        obj.print(n);
        obj.printreverse(n);
        obj.sum(n);
        obj.ReverseArray(arr,index);
       System.out.println( obj.factorial(n));
        
    }
}
