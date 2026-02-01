import java.util.Scanner;

public class BankingProgram {
    static Scanner scanner = new Scanner(System.in);
    static double balance=0;
    public static void main(String args[]){
        //Java banking program for beginners

        boolean isRunning = true;
        int choice; //for taking action

        //need to run the code in while, to check isRunning
        while(isRunning) {
            //Display menu
            System.out.println("*****************");
            System.out.println("WELCOME UDAI BANK");
            System.out.println("*****************");
            System.out.println("1. Show Balance");
            System.out.println("2. Depoist");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("*****************");

            //GET AND PROCESSS USERS CHOICES
            System.out.print("Enter your choic (1-4): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> {
                    balance += depoist();
                    System.out.printf("Your updated balance $%.2f\n ", balance);
                }
                case 3 -> {
                    balance -= withdraw();
                    System.out.printf("Your updated balance $%.2f\n ", balance);
                }
                case 4 -> isRunning = false; //make the exit
                default -> System.out.println("INVALID CHOICE");
            }
        }

        System.out.println("Thanks for visiting");
        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println("*****************");
        System.out.printf("This is your balance $%.2f\n",balance);
    }

    static double depoist(){
        System.out.println("*****************");
        System.out.print("Enter the Money you want to add: ");
        double addedMoney = scanner.nextDouble();
        if(addedMoney < 0){
            System.out.println("Amount cant be negative");
            return 0;
        }else {
            return addedMoney;
        }
    }

    static double withdraw(){
        System.out.println("******************");
        System.out.println("Enter the amount you want to withdraw: ");
        double withdraw = scanner.nextDouble();
        if(withdraw > balance){
            System.out.println("Insufficent Balance!!!");
            return 0;
        }else{
            return withdraw;
        }
    }
}
