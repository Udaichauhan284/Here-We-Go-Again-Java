public class Main {
    public static void main(String[] args) {
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