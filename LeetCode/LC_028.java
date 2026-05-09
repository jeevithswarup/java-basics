public class LC_028 {
    

    public int strStr(String haystack, String needle) {

        int a = haystack.length();
        int b = needle.length();

        for (int i = 0; i < a - b; i++) {
            int j = 0;

            while (j < b && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == b) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LC_028 obj = new LC_028();
        String haystack = "sadmilsad";
        String needle = "klfjsdk";

        System.out.println(obj.strStr(haystack, needle));
    }
}
