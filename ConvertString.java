class ConvertString {
    String str = new String("HUMsAfaR");

    public void Uppercase() {

        for (int i = 0; i < str.length(); i++) {
            int ch = str.charAt(i);
            if (ch >= 97) {
                int uppercase = ch - 32;
                System.out.print((char) uppercase);
            } else {
                System.out.print((char) ch);
            }

        }

    }
    public void LowerCase() {
        System.out.println();
        for (int i = 0; i < str.length(); i++) {
            int ch =str.charAt(i);
            if (ch <=90) {
                int uppercase = ch + 32;
                System.out.print((char) uppercase);
            } else {
                System.out.print((char) ch);
            }
        }
    }

    public static void main(String[] args) {
        ConvertString obj = new ConvertString();
        obj.Uppercase();
        obj.LowerCase();
    }
}