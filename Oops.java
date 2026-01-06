

class Computer { //Class
    public void playmusic() { //Method
        System.out.println("Playing Music.....");
    }

    public String getmeApen(int cost) {
        if (cost >= 10) {
            return "pen";
        } else {
            return "Pencil";
        }
    }
}
/
public class Oops {
    public static void main(String[] args) {
      
        Computer obj = new Computer();
        obj.playmusic();
        String str = obj.getmeApen(2);
        System.out.print(str);
       
    }
}
