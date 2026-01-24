public class Main {
    public static void main(String[] args) {
        /*
        Q. Why do we use the main method in Java?
        ans: The "main" method is the starting point of a Java Program.
            -> when we run a Java Program, JVM looks for the main method first.
            -> w/o main, the program doesn't know where to start.

         Ques. Why public?
         ans: Because JVM is outside your class, so JVM must be able to access the method.
         If it's not public -> JVM cant call it.

         Ques. Why static?
         ans: because JVM does not create an object of the main class.
         static method can be called without creating an object.

         If main was not static.
         -> JVM would need to create an object first.
         -> but it doesn't know which constructor to call.
         -> so Java designers made it static.

         Ques. Why void?
         ans : because main does not return anything to JVM,
         JVM just starts execution, it doesn't expect a result back.

         Ques. Why String[] args?
         ans: this is used to take command line arguments.

         Ques. What happens when we run a Java program? ⚙️

            1. JVM loads the class
            2. JVM searches for main method
            3. JVM calls main
            4. Program execution starts
            5. Program ends

            Q1. Why is main method static?
            Answer: Because JVM calls the main method without creating an object, and static methods
             can be called directly using class name.
         */



        System.out.println("Here We Go again to Master Java");
        System.out.print("Testing Something:\n");
        System.out.println("After Second Line");

        // Variable -> A reusable container for a value, a variable behaves
        //as if it was the value it contains
        //Primitive Type -> simple value stored directly in memory (stack)
        //Reference -> memory address (stack) that points to the heap.

        //Primiitive Types :- int, double, float, boolean
        //References Types :- Array, Strings, Objects, Map

        // -------- //
        /*
         -> In Java we use two of variable decalarations
         1. Declarations
         2. Assigment
        */
        int age; //This is only declarations
        age = 26; //this is assigment, we are assiging something in variable
        System.out.println(age);

        //example of double
        double price = 19.01;
        System.out.println("Price: "+ price);
        double gpa = 3.79;
        System.out.println("GPA: " + gpa);

        //Example of char, use of single quotes
        char grade = 'A'; //why single quotes, in java char represent exactly one UTF-16 char
        System.out.println("GRADE: " + grade);
        char sysmbol = '!';
        System.out.println("Symbol: " + sysmbol);

        //example of boolean
        boolean isStudent = false;
        System.out.println("Check Student: " + isStudent);

        if(isStudent){
            System.out.println("Give them access");
        }else{
            System.out.println("You dont have access");
        }

        //Example of Strng,need to enclose inside double quotes
        //These are Reference Type variable
        String name = "Udai";
        System.out.println("Hello: " + name);
        String currAge = "26";
        System.out.println("Hello mate: " + name + " your age is: " + currAge);
    }
}