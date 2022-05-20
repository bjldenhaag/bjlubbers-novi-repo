import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Step 1: Know what to do! --> DONE
        //  Step 2: Add variables
        int firstNumber;
        int secondNumber;
        int thirdNumber;

        //  Create variable with data type Random, to create random numbers
        Random randomNumbers = new Random();

        //  Give xxNumber variables as value the result of the randomly generated number
        //  Also, we define the range of values of randomly generated numbers (maxValue)
        int maxValue = 9;

        //  By adding 1 (+1) to the generated number, the result will never be 0
        firstNumber = randomNumbers.nextInt(maxValue);
        secondNumber = randomNumbers.nextInt(maxValue);
        thirdNumber = randomNumbers.nextInt(maxValue);

        //  Print values of variables
        System.out.println("De waarde van het eerste getal is: " + firstNumber);
        System.out.println("De waarde van het tweede getal is: " + secondNumber);
        System.out.println("De waarde van het derde getal is: " + thirdNumber);

        //  Create variables for sum and product of the three generated xxNumbers
        int sumValue = firstNumber + secondNumber + thirdNumber;
        int productValue = firstNumber * secondNumber * thirdNumber;

        //  Print sum
        System.out.println("De som van de drie getallen is: " + sumValue);
        System.out.println("Het product van de drie getallen is: " + productValue);

        //  Import Scanner object for reading user input in the console
        Scanner userInput = new Scanner(System.in);

        //  Get user input and store it in a variable
        int firstGuess = userInput.nextInt();

        //  Step 3: Add victory conditions

        //  Step 4: Add menu

    }
}

