public class allocate_minimum_pages {
    

    public int findPages(int[] arr, int k) {
        for (int x : arr) {
            
        }

        return 0;

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
            if (students >= k) {
                return true;
            }

        }


        return false ;
    }
    public static void main(String[] args) {
        allocate_minimum_pages obj   = new allocate_minimum_pages();
        int [] arr=new int[]{12, 34, 67, 90};
        int k=2;
        System.out.println(obj.findPages(arr, k));
    }
}