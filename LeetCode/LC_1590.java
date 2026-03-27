
import java.util.HashMap;

public class LC_1590 {
    
   public int minSubarray(int[] nums, int p) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int totalsum=0;
        int sum=0;
        int min_len=nums.length;
        map.put(0,-1);
        for(  int x:nums){
            sum=(sum+x)%p;
        }
        if(sum==0){
            return 0;
        }
        int k=sum%p;
        sum=0;
        for( int i=0;i<nums.length;i++){
            sum=(sum+nums[i])%p;
        
            int target=(sum-k+p)%p;
            if(map.containsKey(target)){
                min_len=Math.min(min_len,i-map.get(target));
            }
            map.put(sum,i);
        }   
        if(min_len==nums.length){
            return -1;
        }
        return min_len;
             
}
    public static void main(String[] args) {
        LC_1590 obj = new LC_1590();
        int[] nums = new int[] {6,3,5,2};
        int p = 9;
        System.out.println(obj.minSubarray(nums, p));
    }

}