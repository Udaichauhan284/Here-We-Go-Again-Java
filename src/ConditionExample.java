import java.util.Scanner;

public class ConditionExample {
    public static void main(String args[]){
        //Use of if and else, these help us to put the condition on logic

        //Now I will use the Scanner to take input from user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter you age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // 🔥 consume leftover newline


        //take name and check of name
        String name;
        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        boolean isStudent;
        System.out.println("Say you are student (true/fasle:");
        isStudent = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("What you doing mate??? Please enter your name: ");
        }else{
            System.out.println("Your name is: " + name);
        }

        if(age >= 18){
            System.out.println("Hey, You are an adult");
        }else if(age < 0){
            System.out.println("WTF, you not even born yet");
        }else if(age == 0){
            System.out.println("Cute!! You are just a baby");
        }else{
            System.out.println("Enjoy your innocence!!");
        }

        //group 3, for checking is student or not
        if(isStudent){
            System.out.println("You are student!!!");
        }else{
            System.out.println("Fuck Off!! Mate");
        }
        //scanner close
        scanner.close();
    }
}
