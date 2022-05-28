import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        GET NUMBER FROM USER AND PRINT WHETHER ITS POSITIVE OR NEGATIVE
        //  Global Variables
        int number;
        Scanner input = new Scanner(System.in);
        String prompt = "Please enter a number: ";

        System.out.println(prompt);
        number = input.nextInt();

        //  RESULT
        if (number < 0) {
            System.out.println("You have entered a NEGATIVE number");
        } else {
            System.out.println("You have entered a positive number");
        }


        System.out.println(" ");
//        TAKE 3 USER INPUT NUMBERS AND PRINT LARGEST NUMBER
        //  Get numbers
        System.out.println("Please enter 3 numbers. Press ENTER after each entry");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int thirdNumber = input.nextInt();

        //  Compare numbers and print result


        System.out.println(" ");
//        BUILD FIGURES
        StringBuilder symbol = new StringBuilder();

        //  Symbol is nu leeg; voeg bij elke loop ronde een letter toe en druk af op nieuwe regel
        for (int i = 0; i < 5; i++) {
            symbol.append("z");
            System.out.println(symbol);
        }
    }
}