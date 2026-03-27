public class LC_523{
   
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            int rem=sum % k;
            if(map.containsKey(rem)){
                if(i-map.get(rem)>=2)
                return true;
            }else{
            map.put(rem,i);
            }
        }
        return false;
    }
      public static void main(String[] var0) {
      LC_523 nums = new LC_5234();
      String var2 = "ABAB";
      byte var3 = 2;
      var1.characterReplacement(var2, var3);
   }


}

