import java.util.HashMap;

public class LC_560 {
    public int SubarraySum(int arr[], int k) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum = 0;
        int count = 0;
        int value=0;
        for (int i = 0; i < arr.length; i++) {
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            sum += arr[i];
            value = sum - k;
            if (map.containsKey(value)) {
                count+= map.get(value);
            }
        }
        return count;

    }
    public static void main(String[] args) {
        LC_560 obj = new LC_560();
        int[] arr = new int[] { 1, 2, 3, -2, 5 };
        int k = 3;
        System.out.println(obj.SubarraySum(arr, k));
    }
}