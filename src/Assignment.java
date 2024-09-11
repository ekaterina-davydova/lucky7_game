import java.util.Random; 
import java.util.Scanner;
 
public class Assignment 
{
     public static void main(String[] args) 
     {
        Scanner in = new Scanner(System.in);

        String answer1 = "";
        System.out.println("How much money you want to spend? ");
        answer1 = in.nextLine();

        int playerMoney = Integer.parseInt(answer1);
        Random random = new Random();

        String answer2 = "Yes";
        
        do
        {
            System.out.println("Your money " + playerMoney);
            playerMoney--;

            int randomNumber1;
            randomNumber1 = random.nextInt(10) + 1; 
            System.out.println("Random number between 1-10: " + randomNumber1);

            int randomNumber2;
            randomNumber2 = random.nextInt(10) + 1; 
            System.out.println("Random number between 1-10: " + randomNumber2);

            int randomNumber3;
            randomNumber3 = random.nextInt(10) + 1; 
            System.out.println("Random number between 1-10: " + randomNumber3);

            int numbersOfSeven = 0;

            if (randomNumber1 == 7)
            {
                numbersOfSeven++;
            }
            if (randomNumber2 == 7)
            {
                numbersOfSeven++;
            }
            if (randomNumber3 == 7)
            {
                numbersOfSeven++;
            }

            if (numbersOfSeven == 1)
            {
                System.out.println("You won 3 euros");
                playerMoney = playerMoney + 3;
            }

            else if (numbersOfSeven == 2)
            {
                System.out.println("You won 5 euros");
                playerMoney = playerMoney + 5;
            }

            else if (numbersOfSeven == 3)
            {
                System.out.println("You won 10 euros");
                playerMoney = playerMoney + 10;
            }

            else
            {
                System.out.println("You lost.");
            }

            System.out.println("Do you want to play one more round? Yes/No ");
            answer2 = in.nextLine();

            if (answer2.equalsIgnoreCase("No"))
            {
                System.out.println("Thanks for playing!");
                break;
            }
            else if (!answer2.equalsIgnoreCase("Yes"))
            {
                System.out.println("Invalid input. Assuming you want to end the game.");
                break;
            }
        } while (playerMoney > 0);

        System.out.println("End of the game. You have " + playerMoney + " euros left");
        
        in.close();
    }
}