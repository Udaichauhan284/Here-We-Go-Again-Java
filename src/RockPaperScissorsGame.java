import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String args[]){
        //ROCK PAPER SCISSORS GAME
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        //DECLARE VARIABLE
        String[] choices = {"rock", "paper", "scissors"};
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";





        //CHECK WIN CONDITIONS
        do{
            //GET CHOICE FROM THE USERS
            System.out.println("Enter your move (rock, paper, scissors)");
            playerChoice = scanner.nextLine().toLowerCase();

            if(!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")){
                System.out.println("WTF MATE, WHAT YOU DOING!!!");
                continue;
            }
            //GET RANDOM CHOICE FROM COMPUTER
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer move: "+computerChoice);

            if(playerChoice.equals(computerChoice)){
                System.out.println("MATCH TIE!!!");
            }else if((playerChoice.equals("rock") && computerChoice.equals("scissors")) ||
                    (playerChoice.equals("scissors") && computerChoice.equals("paper")) ||
                    (playerChoice.equals("paper") && computerChoice.equals("rock")))
            {
                System.out.println("YOU WIN!!!");
            }else{
                System.out.println("YOU LOSE!! OH NO !!!");
            }
            System.out.println("WANT TO PLAY AGAIN: ");
            playAgain = scanner.nextLine().toLowerCase();
        }while(playAgain.equals("yes"));
        //ASK TO PLAY AGAIN
        //GOODBYE MESSAGE
        System.out.println("SEE YOU LATER");
        scanner.close();
    }
}
