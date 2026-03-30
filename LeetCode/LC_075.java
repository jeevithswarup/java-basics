

class LC_075{
    public void sortColors(int[] nums) {
       int low=0;
      int high=nums.length-1;
      int mid=0;

      while(mid<=high){
        if(nums[mid]==0){
            int temp=nums[mid];
            nums[mid]=nums[low];
            nums[low]=temp;
             low++;
             mid++;
        }else if(nums[mid]==1){
            mid++;
        }else{
            int temp=nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;
            high--;
        }
      }
    }

  public static void main(String[] args) {
      LC_075 obj = new LC_075();
      int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };
     System.out.println(obj.sortColors(nums));
  }
}
            

    