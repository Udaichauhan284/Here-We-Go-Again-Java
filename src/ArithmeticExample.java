import java.util.Scanner;

public class ArithmeticExample {
    public static void main(String[] args){
        //Arithmetic
        int x = 10;
        int y = 5;

        int add = x+y;
        int sub = x-y;
        int multiple = x*y;
        float divide = x/y;
        int rem = x%y;

//        System.out.println("The add: "+ add);
//        System.out.println("The sub: "+sub);
//        System.out.println("The multiple: "+multiple);
//        System.out.println("The divide: "+divide);
//        System.out.println("The rem: "+rem);

        //Augmented Assigment Operators
        //int a = 10;
        //int b = 5;

        //a += b;
        //a -= b;
        //a *= b;
        //a /= b;
        //a %= b;
        //System.out.println("The add in a: " + a);

        //Increment and Descrement
//        int a = 1;
//        int b = 2;
//
//        a = a+1;
//        a += 1;
//        a++; //post increment
//        ++a; //pre increment
//        System.out.println("The A: "+ a++);
//
//        b--;
//        --b;
//        System.out.println("The B: "+ b);

        //ORDER OF OPERATIONS (P-E-M-D-A-S) parentheses, expnations, multiplication, divide, addition, substrations
//        double result = 3+5*(7-2)/2.0;
//        System.out.println("The result: "+ result);

        //Shopping cart program
        Scanner scanner = new Scanner(System.in);
        String itemName;
        System.out.println("What item would you like to buy? ");
        itemName = scanner.nextLine();

        float itemPrice = 0;
        System.out.println("What is the price for each? ");
        itemPrice = scanner.nextFloat();

        int quantity = 0;
        System.out.println("How many would you like? ");
        quantity = scanner.nextInt();

        System.out.println("You have bought "+ quantity +" " + itemName + "/s");
        float total = quantity * itemPrice;
        System.out.println("Your total is " + "$" + total);

        scanner.close();
    }
}
