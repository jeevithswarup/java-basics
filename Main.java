public class Main {
    public static void main(String[] args) {
        boolean is_loggedin = true;
        boolean admin = false;
        int security_level = 1;

        if(is_loggedin && (admin || security_level <= 2)){
            System.out.println("Access Granted...");
        } else {
            System.out.println("Access Denied...");
        }

         }

    }
