public class Main {
    public static void main(String[] args) {
        Order obj = new Order();
        Car obj1 = new Car();
        Student obj2 = new Student();
        obj.Customer_name = "Jeevith";
        obj.amount = 992;
        obj.restaurant = "KFC";
        obj1.car_name = "Benz";
        obj1.model_name = "D589";
        obj1.mileage = 15;
        obj2.student_Name = "Bunny";
        obj2.course = "Btech";
        obj2.erp = "2303031260232";
        obj.PlaceOrder();
        obj1.display_Car_details();
        obj2.student_details();

    }

}

class Order {
    String Customer_name;
    String restaurant;
    double amount;

    void PlaceOrder() {
        System.out.println(Customer_name + " order From " + restaurant + ":" + " Rs " + amount);
    }
}


class Car {
    String car_name;
    String model_name;
    int mileage;

    void display_Car_details() {
        System.out.println(car_name + " " + model_name + " " + " " + mileage);
    }
}

class Student {
    String student_Name;
    String course;
    String erp;

    void student_details() {
        System.out.println(student_Name+" "+course+" "+erp);
        
    }
}
