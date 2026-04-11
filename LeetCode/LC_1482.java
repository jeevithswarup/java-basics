public class LC_1482 {
    
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        if (n > m * k) {
            return -1;
        }
        for (int x : bloomDay) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }
    public boolean IsBloom(int []bloomDay,int day,int m,int k){
        int count=0;
        int no_bouquets=0;

        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=day){
                count++;
            }else{
                no_bouquets+=(count/k);
                count=0;
            }
        }
        no_bouquets+=count/k;
        if(no_bouquets>=m){
            return true;
        }else{
            return false;
        }
    }   
      public int FindDay(int[]bloomDay,int min,int max,int m,int k){
        int low=min;
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(IsBloom(bloomDay,mid,m,k)==true){
              high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
      }
    
   return 0;
    }

    public static void main(String[] args) {
        LC_1482 obj = new LC_1482();
        int[] bloomDay = new int[] { 1, 10, 3, 10, 2 };
        int m = 3;
        int k = 1;
        obj.minDays(bloomDay, m, k);
    }
}
