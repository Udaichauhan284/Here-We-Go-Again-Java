import java.util.Scanner;

public class WeightConversion {
    public static void main(String args[]){
        //WEIGHT Conversion program

        //declare variables
        Scanner scanner = new Scanner(System.in);
        double weight;
        double newwWeight;
        int choice;

        //Welcome message
        System.out.println("Welcome Weight Conversion Program");
        System.out.println("1. Choose #1 to convert lbs to kgs");
        System.out.println("2. Choose #2 to convert kgs to lbs");

        //take choices from user
        System.out.println("Choose an options: ");
        choice = scanner.nextInt();

        if(choice == 1){
            System.out.println("Enter the weight in lbs");
            weight = scanner.nextDouble();
            newwWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is %.2f ", newwWeight);
        }else if(choice == 2){
            System.out.println("Enter the weight in kgs");
            weight = scanner.nextDouble();
            newwWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is %.2f ", newwWeight);
        }else{
            System.out.println("Wrong Choice mate!!!");
        }

        scanner.close();
    }
}
