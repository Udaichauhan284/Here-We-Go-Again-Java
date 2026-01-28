import java.util.Scanner;

public class LogicalOperators {
    public static void main(String args[]){
        //AND => &&
        //OR => ||
        //NOT => !

//        double temp = -20;
//        boolean isSunny = true;
//        if(temp <= 30 && temp >= 0 && isSunny){
//            System.out.println("The Weather is good!!");
//        }else if(temp <=30 && temp >=0 && ! isSunny){
//            System.out.println("Weather is cool!!, But its not sunny today");
//        }else if(temp > 30 || temp < 0){
//            System.out.println("The weather is badd!!!");
//        }else{
//            System.out.println("I dont know mate!!");
//        }

        Scanner scanner = new Scanner(System.in);

        //username must be between 4-12 characters
        //username must not contain spaces or underscores
        String username;
        System.out.println("Enter your new username ");
        username = scanner.nextLine();
        if(username.length() < 4 || username.length() > 12){
            System.out.println("Username must be between 4-12 characters");
        }else if(username.contains(" ") || username.contains("_")){
            System.out.println("Username must not contain spaces ot spaces");
        }
        else{
            System.out.println("Welcome: " + username);
        }

        scanner.close();
    }
}
