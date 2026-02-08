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

        /*
        Super -> Refers to the parent class(subclass <- superclass)
        Used in constructors and method overriding. calls the parent constructor to initialize attributes.

        From GFG
        The super keyword in Java is used to refers to the immediate parent class object in an
        inheritance hierarchy. It allows a subclass to explicity access parent class members when they are
        hidden or overridden. This keyword helps maintain clarity and control while working with inheritance.
            -> Used to call parent class constructors using super()
            -> helps access parent class methods and variables when overridden or hidden.
            -> ensures proper inheritance behaviour and code reusability.
            NOTE: Super keyword allows subclasses to inherit the behaviour and functionality of the parent class.

        => Advantages of Using Java Super Keyword
        The advantages of super keyword are listed below:
            -> with the help of super keyword, subclasss can inherit the functionality from their parent classes.
            -> subclasses can override methods and can access fields and methods from their parent class with the help of
                super keyword, because of this code becomes more flexible.
            -> with the help of super keyword we can easily access the methods and fields from the parent class without recreating it in
                the subclass.
            -> with the help of super keyword we can achieve abstraction and encapsulation, Subclass can focus on thier specified
                tasks and the parent class take care of the general functionality.

         => Important Points
            -> super must be the first statement in a subclass constructor.
            -> if no superclass constructor is explicitly called, Java automatically inserts a call to the no-argument constructor.
            -> if the superclass does not have a no-argument constructor, compilation fails.
            -> constructor calls form a chain, ending with the Object class constructor.
        */
        Person person1 = new Person("Udai", "Chauhan");
        person1.showName();
        StudentE student = new StudentE("Sandesh", "Kumar", 3.75);
        student.showName();
        student.showGPA();

        //Example of Use case of super 1
        CarGFG car1 = new CarGFG();
        car1.display();

        //Example of Usecase of super 2. super to use of method
        StudentGFG stud1 = new StudentGFG();
        stud1.display();

        //Example of Usecase of super 3. call constructor
        StudentGFG1 s = new StudentGFG1();

        /*

        */
    }
}

//Example of Super
class Person{
    String firstName;
    String lastName;

    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void showName(){
        System.out.println("The name of person: "+firstName+" "+lastName);
    }
}
//now creating the student class to extend the Person
class StudentE extends Person{
    double gpa;
    StudentE(String firstName, String lastName, double gpa){
        super(firstName, lastName);
        this.gpa = gpa;
    }
    void showGPA(){
        System.out.println(this.firstName+"'s gpa is "+this.gpa);
    }
}

/*
 1. Use of Super with Variables
 Suppose there is a child, whose name is "MAX", and the child has also parent name "MAX".
 Normally to refer to the parent, we should say "parent max" this is similar to using super.maxSpeed
*/
class Vehicle{
    int maxSpeed = 120;
}
class CarGFG extends Vehicle{
    int maxSpeed = 180;

    void display(){
        //print maxSpeed from the vehicle class
        System.out.println("Maximum speed: "+super.maxSpeed);
        //print this class speed
        System.out.println("Maximum speed of car: "+this.maxSpeed);
    }
}

/*
 2. Use of super with Methods
 This is used when we want to call the parent class method. So, whenever a parent and child class have the same
 named methods then to resolve the ambiguity we use the super keyword.
 Example:- it is simply just like when we want to listen to our parent's advice instead of our own decision.
 super.methodName() helps us follows the parent's behavior in code.
*/
class PersonGFG{
    void message(){
        System.out.println("This is person class");
    }
}
//subclass Student
class StudentGFG extends PersonGFG{
    void message(){
        System.out.println("THis is student class");
    }

    //display() methods is only in Student class
    void display(){
        message(); //this will invoke a method of current class
        super.message(); //this will invoke a method of parent class.
    }
}

/*
3. Use of super() with Constructors
the super() keyword can also be used to access the parent class constructor.
One more important thing is that 'super' can call both parametric as well as non-parametric
constructors depending on the situation.
Example: Before a child born, first the parent exists, similarly, the parent class constructor must be called
before the child's constructor finishes it's work.
*/
class PersonGFG1{
    PersonGFG1(){
        System.out.println("Person class constructor");
    }
}
//subclass Student extending the Person class
class StudentGFG1 extends PersonGFG1{
    StudentGFG1(){
        //invoke or call parent class constructor
        super();
        System.out.println("Student class constructor");
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
