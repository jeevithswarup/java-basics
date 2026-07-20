

public class SubArrayRanges {

    public long SubRanges(int[] arr) {
        long sum = 0;

        for (int i = 0; i < arr.length; i++) {

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for (int j = i; j < arr.length; j++) {
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);

                sum += (max - min);
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        SubArrayRanges obj = new SubArrayRanges();
         
        int[] arr = new int[] { 4, -2, -3, 4, 1 };
        System.out.println(obj.SubRanges(arr));
   }   
}

