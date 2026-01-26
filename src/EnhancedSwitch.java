import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String args[]){
        //Enhanced Switch -> A replacement to many else if statements (Java14 features)

        //taking inpout from user
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Hey Please enter the day: ");
        //String day = scanner.next();

        //switch (day){
//            case "Monday" -> System.out.println("It is weekday");
//            case "Tuesday" -> System.out.println("It is weekday!! still");
//            case "Wednesday" -> System.out.println("It is weekday!!! still aggg");
//            case "Thursday" -> System.out.println("It is weekday, but weekend comming");
//            case "Friday" -> System.out.println("Yeah Last weekday!!!");
//            case "Saturday" -> System.out.println("First day of weekend");
//            case "Sunday" -> System.out.println("Last day of weekend!!!, naahhh");
//            default -> System.out.println(day + " what the fuck is that!!!");

            //we can also combine same result case
           // case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("Hey, Still its a weekday!!!");
           // case "Saturday", "Sunday" -> System.out.println("Hey its a weekend enjoy!!!");
           // default -> System.out.println(day + " what the fuck is that???");
        //}

        //Now lets make the calculator using the switch
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result=0;

        System.out.println("Enter teh first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Ebter an operator (+,-,/,*): ");
        operator = scanner.next().charAt(0);

        switch(operator){
            case '+' -> result = num1+num2;
            case '-' -> result = num1-num2;
            case '*' -> result = num1*num2;
            case '/' -> {
                if(num2 == 0){
                    System.out.println("Cannot divide by Zero!!");
                    return;
                }else{
                    result = num1/num2;
                }
            }
            default -> { System.out.println("Not an operator"); return;}
        }
        System.out.println("The result is: "+ result);

        scanner.close();
    }
}
