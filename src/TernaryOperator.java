import java.util.Scanner;

public class TernaryOperator {
    public static void main(String args[]){
        //Ternary Operator ? -> return 1 of 2 values if a condition is true
        //variable = (condition) ? ifTrue : ifFalse;

        int score = 61;
        String passOrFail = (score >= 60) ? "PASS" : "FAIL";
        System.out.println("The result: "+passOrFail);

        int number = 5;
        String isEvenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
        System.out.println("The number is: "+ isEvenOrOdd);

        int hours = 13;
        String timeOfDay = (hours >= 12) ? "P.M" : "A.M";
        System.out.println("The time of day: "+timeOfDay);

        //Temperature Conventor
        Scanner scanner = new Scanner(System.in);
        double temp;
        double newTemp;
        String unit;

        System.out.println("Enter the temperature: ");
        temp = scanner.nextDouble();

        System.out.println("Convert to Celsius or Fahrenheit? (C or F): ");
        unit = scanner.next().toUpperCase();

        //condition if unit is c true of c : false make it in f
        if(! unit.equals("C") && ! unit.equals("F")) {
            System.out.println("Please enter the correct unit!!");
            return;
        }
        newTemp = (unit.equals("C")) ? ((temp-32)*5/9) : ((temp * 9/5)+32);
        System.out.printf("The converted temp is %.2f",newTemp);
        scanner.close();
    }
}
