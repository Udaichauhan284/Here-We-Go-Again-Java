import java.util.Random;
import java.util.Scanner;

public class RandomGuessNumber {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int guess = 0;
        int attempets = 0;
        int randomNumber = random.nextInt(1,11); //random number between 1 10

        System.out.println("Welcome to Number Guessing Game");
        System.out.println("Guess a Number between 1 to 10");

        do{
            System.out.println("Enter your guess number: ");
            guess = scanner.nextInt();
            attempets++;
            if(guess < randomNumber){
                System.out.println("Your guess is low!!!");
                System.out.println("Your attempet: "+attempets);
            }else if(guess > randomNumber){
                System.out.println("Your guess is high!!!");
                System.out.println("Your attempts: "+attempets);
            }else{
                System.out.println("Yeah, CORRECT!!!!!");
                System.out.print("You take attempts: "+attempets);
            }
        }while(guess != randomNumber);
    }
}
