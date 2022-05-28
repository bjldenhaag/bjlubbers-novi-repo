import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //
        //  STEP 1: Know what to do! --> DONE
        //
        //  STEP 2: Setting up the game
        //  Variables
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

        //
        //  STEP 3: Randomized variables readback and result calculation
        //
        //  Print values of variables
        System.out.println("De waarde van het eerste getal is: " + firstNumber);
        System.out.println("De waarde van het tweede getal is: " + secondNumber);
        System.out.println("De waarde van het derde getal is: " + thirdNumber);

        //  Create variables for sum and product of the three generated xxNumbers
        int sumValue = firstNumber + secondNumber + thirdNumber;
        int productValue = firstNumber * secondNumber * thirdNumber;

        //  Print sum:
        System.out.println("De som van de drie getallen is: " + sumValue);
        System.out.println("Het product van de drie getallen is: " + productValue + "\n");

        //  Define standard maximum rounds (for "for-loop" and be ready to scan user input
//        int maxRounds = 3;
        Scanner userInput = new Scanner(System.in);

//      OPTION 1:
//      "For-loop" for multiple rounds
//        for (int i = 0; i < maxRounds; i++) {

//      OPTION 2:
        //  "While" loop as alternative for "for-loop"
        while (true) {
            boolean hasPlayerWon = false;
            while (!hasPlayerWon) {
                //
                //  STEP 4: User input
                //
                //  Get user input and store it in a variable.
                System.out.println("Voer nu je eerste getal in en druk op ENTER");
                int firstGuess = userInput.nextInt();
                System.out.println("Voer nu je tweede getal in en druk op ENTER");
                int secondGuess = userInput.nextInt();
                System.out.println("Voer nu je derde getal in en druk op ENTER");
                int thirdGuess = userInput.nextInt();

                //  Show input to user.
                System.out.println("\nDe volgende getallen zijn opgegeven: ");
                System.out.println("Getal 1: " + firstGuess);
                System.out.println("Getal 2: " + secondGuess);
                System.out.println("Getal 3: " + thirdGuess);

                int sumUserValues = firstGuess + secondGuess + thirdGuess;
                int productUserValues = firstGuess * secondGuess * thirdGuess;

                //
                //  STEP 5: Add victory conditions
                //
                //  Check if player has won - do entered numbers equal same sum and product? --> win/lose
                //  This way, it is unnecessary to check for each individual value, since you compare the outcomes!
                hasPlayerWon = (sumValue == sumUserValues) && (productValue == productUserValues);

                if (hasPlayerWon) {
                    System.out.println("Je hebt gewonnen!");
                } else {
                    System.out.println("Helaas, je hebt verloren.");
                }
            }

            //
            //  STEP 6: Add menu to game
            //
            //  STEP 6.1: Add "end game?" prompt to user after each round
            //  User will continue game until he takes action
            boolean continueGame;

            //  STEP 6.2: Prompt and read user input
            System.out.println("Wil je nog een ronde spelen? Toets 'y' for ja, 'n' voor nee");
            String yesOrNo = userInput.next();

            //  STEP 6.3: Execute user's decision
            //
            //  NOTE: No "break" is entered in each case, since this is no longer necessary since Java 13>
            //        arrow and yield replace the double point here, after which no break is necessary
            switch (yesOrNo) {
                case "y" -> {
                    System.out.println("Op naar de volgende ronde!");
                    continueGame = true;
                }
                case "n" -> {
                    System.out.println("Einde spel");
                    continueGame = false;
                }
                default -> {
                    System.out.println("Geen of een ongeldige waarde ingevuld. Je gaat nu nog een ronde.");
                    continueGame = true;
                }
            }
            if (!continueGame) {
                break;
            }
        }
        System.out.println("GAME OVER!\nTot de volgende keer!");


    }
}

