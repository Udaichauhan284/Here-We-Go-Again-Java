//Need to import the Scanner class form util
import java.util.Scanner;
public class ScannerExample {
    public static void main(String[] args){
        //What is Scanner in Java ?
        /*
        Scanner is a class in Java that helps us to take the input from the users (keyboard), files, or other sources.
         */
        //Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter your name: ");
//        String name = scanner.nextLine(); //nextLine is used to enter the string from users
//
//        System.out.println("Enter you age please: ");
//        int age = scanner.nextInt(); //this will help to enter the interger
//        scanner.nextLine(); //This help to clear the input buffers, mostly used after nextInt or nextDouble
//
//        System.out.println("Enter your GPA");
//        double gpa = scanner.nextDouble(); //this will help to have the double to enter
//
//        System.out.println("Are you student: ");
//        boolean isStudent = scanner.nextBoolean(); //help to enter the boolean value
//
//        System.out.println("Hello Sir/Maam: " + name + " your age is: " +  age);
//        System.out.println("Your gpa is: "+gpa);
//        if(isStudent){
//            System.out.println("You have student card, congrats");
//        }else{
//            System.out.println("Please get out");
//        }

        //Calculate the area of a rectangle
        //Initialing Scanner again to used to it
//        Scanner scanner = new Scanner(System.in);
//        double width = 0;
//        double height = 0;
//        double area = 0;
//
//        System.out.println("Enter the Width: ");
//        width = scanner.nextDouble();
//
//        System.out.println("Enter the Height: ");
//        height = scanner.nextDouble();
//
//        area = width * height;
//
//        System.out.println("You rectangle area is: " + area + "cm^2");


        //MAD LIBS GAME
        Scanner scanner = new Scanner(System.in);
        String adjective1;
        String noun1;
        String adjective2;
        String verb1;
        String adjective3;

        System.out.println("Enter an adjective (description): ");
        adjective1 = scanner.nextLine();
        System.out.println("Enter a noun (animal or person): ");
        noun1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.println("Enter a verb end with -ing (action): ");
        verb1 = scanner.nextLine();
        System.out.println("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("Today I went to a " + adjective1 + " zoo.");
        System.out.println("In an exhibit, I see a "+noun1+".");
        System.out.println(noun1+" was "+adjective2+" and "+verb1+".");
        System.out.println("I was "+adjective3+"!");

        scanner.close(); //Good to close the scanner, otherwise some uncessary problems can happen
    }
}
