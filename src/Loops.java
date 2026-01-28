import java.util.Scanner;

public class Loops {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String name = "";

        //so here one time program will check, if name is empty if we again not enter, it will continue

//        if(name.isEmpty()){
//            System.out.print("Enter your name");
//            name = scanner.nextLine();
//        }

        //But with while loop, if we not give the name, it will check again and again
//        while(name.isEmpty()){
//            //it will continue checking if name is empty
//            System.out.println("Enter your name: ");
//            name = scanner.nextLine();
//        }
//        System.out.println("Hello: " + name);

        int age = 0;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        //now here i will check, if user put the negative age, so i need to stop them, so use loop
//        while(age < 0){
//            System.out.println("Please enter the correct age!!!");
//            System.out.println("Enter your age: ");
//            age = scanner.nextInt();
//        }
//        System.out.println("You are " + age + " years old");

        //DO...while loop
        //do code once, and then check the condition

        //Check the number between 1 to 10
        int number = 0;
        do{
            System.out.println("Enter a number between 1 - 10: ");
            number = scanner.nextInt();
        }while(number < 1 || number > 10);

        System.out.println("You picked " + number);
        scanner.close();
    }
}
