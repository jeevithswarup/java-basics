import java.util.Arrays;

public class LC977 {
    
    public void SquareElements(int nums[]) {
          for(int i=0;i<nums.length;i++){
                
           nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
public static void main(String[] args) {
    LC977 obj = new LC977();
    int[] nums = new int[] { -4, -1, 0, 3, 10 };
    obj.SquareElements(nums);
}
    }

