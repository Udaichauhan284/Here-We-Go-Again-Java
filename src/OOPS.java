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

        /*
        Static -> Makes a variable or method belong to the class rather than to any specific object.
                   Commonly used for utility methods or shared resources.
        */
        Friend friend1 = new Friend("Bob");
        System.out.println("The num of friends: "+Friend.numOfFriends); //this will show 1

        //declaring new friend
        Friend friend2 = new Friend("Sam");
        System.out.println("The num of friends "+ Friend.numOfFriends); //this is also showing the 1
        Friend.showFriends();


        /*
        Inheritance -> One class inherits the attributes and methods from another class
            Child inherits from Parent
        */
        //Now crreating object of Dog and Cat
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        System.out.println("Is dog1 is alive: "+dog1.isAlive);
        dog1.eat(); //now dog have no method, thats why dog inherting the method of animal, showing
        //The animal is eating

        System.out.println("The lives of dog: "+dog1.lives);
        System.out.println("The lives of cat: "+cat1.lives);
        dog1.speak();
        cat1.speak();

        Plant plant = new Plant();
        plant.photosynthesize();

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

class Friend{
    String name;
    static int numOfFriends; //now i want to keep it shared for all the resources,
    //make it static
    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showFriends(){
        System.out.println("You have: "+numOfFriends+" friends");
    }
}

//Examples of Inheritance
class Organism{
    boolean isAlive;
    Organism(){
        isAlive = true;
    }
}
class Animal extends Organism{

    void eat(){
        System.out.println("The animal is eating");
    }
}

class Dog extends Animal{
    int lives = 1;
    void speak(){
        System.out.println("The dog says WOOF");
    }
}

class Cat extends Animal{
    int lives = 9;
    void speak(){
        System.out.println("The dog say MEOW");
    }
}

class Plant extends Organism{
    void photosynthesize(){
        System.out.println("The plant absorbs sunlight");
    }
}
