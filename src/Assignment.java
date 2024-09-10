import java.util.Random; 
 
public class Assignment 
{
     public static void main(String[] args) 
     {
        int playerMoney = 5;
        Random random = new Random();
        
        while(playerMoney > 0)
        {
            playerMoney--;
            System.out.println("Your money " + playerMoney);

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
                System.out.println("You won 3€");
                playerMoney = playerMoney + 3;
            }

            else if (numbersOfSeven == 2)
            {
                System.out.println("You won 5€");
                playerMoney = playerMoney + 5;
            }

            else if (numbersOfSeven == 3)
            {
                System.out.println("You won 10€");
                playerMoney = playerMoney + 10;
            }

            else
            {
                System.out.println("You lost.");
            }
        }

        System.out.println("End of the game. You are out of money ");
    }
}