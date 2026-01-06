public class LC0014_Longprefix {

    String[] str = new String[] { "flower", "fly", "flag" };
    String Prefix = "";
    public void Prefix() {
        for (int i = 0; i < str.length; i++) {
            for (int j = 1 + i; j < str.length; j++) {
                String str1 = str[i];
                String str2 = str[j];
                for (int c = 0; c < str1.length(); c++) {
                    if (str1.charAt(c) == str2.charAt(c)) {
                        Prefix += str1.charAt(i);
                    } else {
                        
                        break;
                    }
                }
            
            }
        }
      System.out.println(Prefix);
    }
    public static void main(String[] args) {
        LC0014_Longprefix obj = new LC0014_Longprefix();
        obj.Prefix();
    }
    
}
