import java.util.Scanner;

public class OOPS {
    public static void main(String args[]){
        //Object -> An entity that holds data (attributes) and can perform actions
        //(methods). It is a reference data type
        //We store the data of object in Heap and the address of that location store in stack
        Scanner scanner = new Scanner(System.in);

        Car car = new Car();
        System.out.println("Make of Car: "+car.make);
        System.out.println("Model of car: "+car.model);
        System.out.println("Year of Car: "+car.year);
        System.out.println("Price of Car: "+car.price);

        car.start();
        car.stop();

        //Constructor -> A special method to initialize objects. You can pass
        //arguments to a constructor and set up initial values.
        //Now here i will call the Student object, which will call the constructor
        //according to the parameters
        Student stu1 = new Student("Udai", 26, 4.0, false);
        System.out.println("The student info of 1: "+stu1.name);

        Student stu2 = new Student("Sandesh", 26, 4.0,true);
        System.out.println("The student info of 2: "+stu2.name);
    }
}

class Car{
    String make = "FORD";
    String model = "Mustang";
    int year = 1967;
    double price = 49000.00;
    boolean isRunning = true;

    void start(){
        System.out.println("You Start the Engine!!");
    }
    void stop(){
        System.out.println("You stop the engine!!");
    }
}

class Student {
    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa, boolean isEnrolled){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = isEnrolled;
    }
}
