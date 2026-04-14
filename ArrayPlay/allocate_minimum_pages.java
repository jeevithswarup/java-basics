public class allocate_minimum_pages {
    

    public int findPages(int[] arr, int k) {
        int low = 0;
        int high = 0;
        for (int x : arr) {
            low = Math.max(low, x);
            high += x;
        }
        while (low <= high) {
            int max_pages = low + (high - low) / 2;

            if (isValid(arr, k, max_pages)) {
                high = max_pages - 1;
            } else {
                low = max_pages + 1;
            }
        }

        return low;

    }
    
    public boolean isValid(int[] arr, int k, int max_pages) {
        int students = 1;
        int countPages = 0;

        for (int pages : arr) {
            if (countPages + pages <= max_pages) {
                countPages += pages;
            } else {
                students++;
                countPages = pages;
            }
            if (students> k) {
                return false;
            }

        }


        return true ;
    }
    public static void main(String[] args) {
        allocate_minimum_pages obj   = new allocate_minimum_pages();
        int [] arr=new int[]{12, 34, 67, 90};
        int k=2;
        System.out.println(obj.findPages(arr, k));
    }
}