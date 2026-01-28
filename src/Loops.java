import java.util.Scanner;

public class Loops {
    public static void main(String args[]) throws InterruptedException{
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

//        int age = 0;
//        System.out.print("Enter your age: ");
//        age = scanner.nextInt();

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
//        int number = 0;
//        do{
//            System.out.println("Enter a number between 1 - 10: ");
//            number = scanner.nextInt();
//        }while(number < 1 || number > 10);
//
//        System.out.println("You picked " + number);


        //For Loop => excutes some code a CERTAIN amount of times
//        for(int i=10; i>=1; i--){
//            System.out.println("Hello this will run : " + (i));
//        }

        //Now we will take for loop time, how many time it will run
//        int max = 0;
//        System.out.print("Hey Enter the times, you want to run the loop: ");
//        max = scanner.nextInt();
//        System.out.println("You want "+max+" times for loop run!!! DAMMMM");
//
//        for(int i=1; i<=max; i++){
//            System.out.println("Enjoy your show!!!");
//        }

        //Code for timmer
//        System.out.println("How many seconds to countdow from: ");
//        int start = scanner.nextInt();
//
//        for(int i=start; i>=1; i--){
//            System.out.println("Tick Tick : "+i);
//            Thread.sleep(1000);
//        }
//        System.out.println("GOP GOP GOP !!!");

        //Learning about the BREAK and CONTINUE
        //First break, when in loop, if condition match and if we use the break, it will break the iteration there and move out
//        for(int i=0; i<10; i++){
//            if(i == 5){
//                break;
//            }
//            System.out.println("Inside loop: "+i);
//        }
//        System.out.println("Outside of loop");

        //Continue, it will skip the condition rule and continue after it
//        for(int i=0; i<10; i++){
//            if(i == 5){
//                continue;
//            }
//            System.out.println("Inside Loop: "+i);
//        }
//        System.out.println("Outside after continue");

        //Nested LOOP, loop inside other loop
        //for every other 3 times, i need to print the hello
        for(int i=0; i<3; i++){
            System.out.println("Inside first loop ");
            for(int j=i; j<3; j++){
                System.out.println("Inside second loop ");
                System.out.println("Hello");
            }
        }

        for(int i=1; i<=3; i++){
            for(int j=1; j<=9; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Game of creation of grid of Symbols
        int row = 0;
        int cols = 0;
        char symbols;

        System.out.println("Enter the number of rows: ");
        row = scanner.nextInt();
        System.out.println("Enter the number of cols: ");
        cols = scanner.nextInt();
        System.out.println("Enter the symbol you want in grid: ");
        symbols = scanner.next().charAt(0); //next will work for string and then we can use charAt, give me char at 0 index

        for(int i=1; i<=row; i++){
            for(int j=1; j<=cols; j++){
                System.out.print(symbols+" ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
