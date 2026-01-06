public class LongestPalindrome {
    int[] arr = new int[] { 121, 54545, 999090, 535 };
    public void Palindrome() {
        int longest_palindrome = 0;
        int prev_count=0;
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int count = 0;
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
            int buffer = arr[i];
            int rev = 0;
            int pow = count;
            while (buffer != 0) {
                int rem = buffer % 10;
                buffer = buffer / 10;
                rev = (int) (rev + rem * Math.pow(10, pow - 1));
                pow--;
            }
            if (arr[i] == rev && count > prev_count) {
                longest_palindrome = arr[i];
                prev_count = count;
            }
        }
        System.out.println(longest_palindrome);
        }
    public static void main(String[] args) {
        LongestPalindrome obj = new LongestPalindrome();
        obj.Palindrome();
    }
    
}