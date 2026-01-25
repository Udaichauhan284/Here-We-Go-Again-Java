import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String args[]){
        //now call the method
        Random random = new Random();
//        int number;
//        number = random.nextInt(1,100); //1 is inclusive and 100 is exclusive
//        System.out.println("Your random number numberis: " + number);

        //Lets play Heads or Tails
//        boolean coin;
//        coin = random.nextBoolean();
//        if(coin){
//            System.out.println("Mate Heads it is!!");
//        }else{
//            System.out.println("Tails Mate");
//        }

        //Some Maths Class and there Methods
        //System.out.println("PI: " + Math.PI);
        //System.out.println("Exponation: " + Math.E);

        double numbers;

        //numbers = Math.pow(2,3); //8.0
        //System.out.println("POWER: " + numbers);

        //numbers = Math.abs(-5); //5.0
        //System.out.println("ABS: " + numbers);

        //numbers = Math.sqrt(9); //3
        //System.out.println("Square Root: " + numbers);

        //numbers = Math.round(3.14); //3
        //numbers = Math.round(3.56); //4
        //System.out.println("Round: " + numbers);

        //numbers = Math.ceil(3.14); //4
        //System.out.println("CEIL: " + numbers);

        //numbers = Math.floor(3.78); //3
        //System.out.println("FLOOR: " + numbers);

        //int maxOfTwo = Math.max(10,21);
        //System.out.println("Max of Two: " + maxOfTwo);

        //int minOfTwo = Math.min(10,21);
        //System.out.println("Min of Two: " + minOfTwo);

        //HYPOTENUSE c = Math.sqrt(a^2 + b^2)
        Scanner scanner =  new Scanner(System.in);

        //System.out.println("Enter a: ");
        //int a = scanner.nextInt();
        //scanner.nextLine();

        //System.out.println("Enter b: ");
        //int b = scanner.nextInt();
        //scanner.nextLine();

        //double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        //System.out.printf("The Hypotenuse: %.2fcm^2\n",c);
        //scanner.close();

        //Learning about the printf() is a method used to format output
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello Sir %s\n", name); //while using printf need for String need to use s
        System.out.printf("Your name starts with %c\n", firstLetter); //for char c
        System.out.printf("Your age %d\n", age); //for int, use d
        System.out.printf("Your height %.2f inches tall\n", height); //for double need to use f
        System.out.printf("You work here %b\n", isEmployed);

        System.out.printf("%s is %d year old and his height is %.3f and he works here %b\n", name,age,height,isEmployed);

        //+ => output a plus
        //, => comma grouping operator
        //( => negative numbers are enclosed in ()
        //space => display a minus if negative, space if positive

        double price1 = 90000.99;
        double price2 = 100000.16;
        double price3 = -54000.02;

        System.out.printf("% .2f\n", price1);
        System.out.printf("% .2f\n", price2);
        System.out.printf("% .2f\n", price3);

        //0 => zero padding
        //number => right justified padding
        //negative number = left justified padding

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7040;

        System.out.printf("%-4d\n", id1); //0->4 padding
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
