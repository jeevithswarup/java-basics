public class SubArrayPS {
    public int CountSubbArray(int[] arr, int k) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum== k) {
                    count++;
                }
            }

        }
        return count;
    }
    public static void main(String[] args) {
        SubArrayPS obj = new SubArrayPS();
        int[] arr = new int[] { 1, 2, 3};
        int k = 3;
        System.out.println(obj.CountSubbArray(arr, k));
    }   
}
