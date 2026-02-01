import java.util.Scanner;

public class Methods {
    public static void main(String args[]){
        //Method -> a block of reusable code that is executed when called ()
        //now i will call method here

        //Now i will pass the argument
        String name = "Udai";
        int age = 26;
        //wishBirthday(name, age);

        //Now square of number, from user input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey enter the number, you want sqaure of?");
        int number = scanner.nextInt();
        System.out.println("Square of Number: " + squareOfNumber(number));
    }
    static void wishBirthday(String name, int age){
        System.out.printf("Happy Birthday to you, %s!\n", name);
        System.out.printf("You are %d year old!!\n", age);
        System.out.println("Great year ahead");
    }
    static int squareOfNumber(int number){
        return number*number;
    }
}
