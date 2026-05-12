public class Main {
    public static void main(String[] args) {
        Order obj = new Order("jeevith","Udpi",989);
        Car obj1 = new Car("Benz","A9hx",15);
        Student obj2 = new Student("Jeevtih","Btech","2303031260232");
        obj.PlaceOrder();
        obj1.display_Car_details();
        obj2.student_details();
    }

}

class Order {
    String Customer_name;
    String restaurant;
    double amount;

    Order( String Customer_name,String restaurant,double amount){
        this.Customer_name=Customer_name;
        this.restaurant=restaurant;
        this.amount=amount;
    }

    void PlaceOrder() {
        System.out.println(Customer_name + " order From " + restaurant + ":" + " Rs " + amount);
    }
}


class Car {
    String car_name;
    String model_name;
    int mileage;

    Car(String car_name, String model_name, int mileage) {
        this.car_name = car_name;
        this.model_name = model_name;
        this.mileage = mileage;
    }

    void display_Car_details() {
        System.out.println(car_name + " " + model_name + " " + " " + mileage);
    }
}

class Student {
    String student_Name;
    String course;
    String erp;

   Student(String student_Name,
    String course,
           String erp) {
       this.student_Name = student_Name;
       this.course = course;
       this.erp = erp;
    }
    void student_details() {
        System.out.println(student_Name+" "+course+" "+erp);
        
    }
}
