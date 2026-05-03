public class ReverseArray {

    public int[] Reverse(int[] arr, int i, int n) {

        if (i >= n / 2)
            return arr;
        int temp = arr[i];
        arr[i] = arr[n - i - 1];
        arr[n - i - 1] = temp;
        Reverse(arr, i + 1, n);
        return arr;
    }
    
    public boolean Palindrome(char[] ch, int i, int l) {
        

        if (i >= l / 2) {
            return true;
        }
        if (ch[i] != ch[l - i - 1]) {
            return false;
        }

       
        return Palindrome(ch, i, l);
        
    }
    
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        int n = arr.length;
        int i = 0;
        String str = "MADAM";
        char[] ch = str.toCharArray();
        int l = str.length();
        obj.Reverse(arr, i, n);
        obj.Palindrome(ch,i,l);
    }
}
