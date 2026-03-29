public class Valid_Palindrome {
    public boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length()-1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Valid_Palindrome obj = new Valid_Palindrome();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(obj.isPalindrome(s));
    }
}