public class Two {
    public void multiply(int n) {
         for (int i = 1; i <= 10; i++) {
            System.out.println(n +"*"+ i + "="+n*i);
           
    }
    }
    public static void main(String[] args) {
        Two obj = new Two();
        obj.multiply(2);

    }
}

