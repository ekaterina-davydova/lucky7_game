import java.util.Random; 
 
public class Assignment 
{
     public static void main(String[] args) 
     {
 
        Random random = new Random();
        
        int randomNumber1;
        randomNumber1 = random.nextInt(10) + 1; 
        System.out.println("Random number between 1-10: " + randomNumber1);

        int randomNumber2;
        randomNumber2 = random.nextInt(10) + 1; 
        System.out.println("Random number between 1-10: " + randomNumber2);

        int randomNumber3;
        randomNumber3 = random.nextInt(10) + 1; 
        System.out.println("Random number between 1-10: " + randomNumber3);

        if (randomNumber1 == 7 || randomNumber2 == 7 || randomNumber3 == 7)
        {
            System.out.println("You won");
        }
        else
        {
            System.out.println("You lost");
        }
        
    }
}