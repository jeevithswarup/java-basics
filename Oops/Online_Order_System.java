class User {

    String name;
    String email;

    //Default constructor
    User() {
        name = "Guest";
        email = "Not Provided";
    }

    //Constructor
    User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    void displayUser() {
        System.out.println(name + " " + email);
    }
}

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void displayProduct() {
        System.out.println(productName + " " + price);
    }
}

class Order {
    User user;            //.................this know as HAS-A Realtionship(Composition)
    Product product;

    Order(User user, Product product) {
        this.user = user;
        this.product = product;
    }

    void displayOrderDetails() {
        System.out.println(user.name + " ordered " +product.productName +" worth Rs "+ product.price);
    }
}
public class Online_Order_System {
    public static void main(String[] args) {
        User obj = new User("Jeevith", "2303030xx@paxxl.ac.in");
        User obj3 = new User();
        Product obj1 = new Product("Laptop", 49889.99);
        Order order = new Order(obj, obj1);
        
        obj.displayUser();
        obj3.displayUser();
        obj1.displayProduct();
        order.displayOrderDetails();
                          

    }
}
