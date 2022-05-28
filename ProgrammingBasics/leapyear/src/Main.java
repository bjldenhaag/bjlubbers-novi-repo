import java.util.Calendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Enable Scanner only if not debugging -> declare debug variable
//        boolean debug = false;

        /*
         *   Check if user input equals leap year in a range until today's year.
         */
        //  Declare variables and get current year
        int thisYear = Calendar.getInstance().get(Calendar.YEAR);
        Scanner input = new Scanner(System.in);
        int userNumber;

        //  Get input
        System.out.println("Please enter a number between no greater than " + thisYear);
        userNumber = input.nextInt();
        boolean checkLeapYear = userNumber % 4 == 0;

        //  Set year to current year in case too high a number has been entered + inform user
        if (userNumber > thisYear) {
            System.out.println("This is past the current year. Year reset to " + thisYear);
            userNumber = thisYear;
        } else {
            System.out.println("You chose the year: " + thisYear);
        }

        //  Print results
        if (checkLeapYear) {
            System.out.println(userNumber + " IS a leap year!");
        } else {
            System.out.println(userNumber + " is NOT a leap year");
        }

        //  EMPTY LINE
        System.out.println(" ");

        /*
        *   For-loop for checking if leapYear is true
        */
        //  Declare variables and initialize loop
        for (int year = 2000; year < 2007; year++) {
            //  Check if leapYear is true
            boolean isLeapYear = year % 4 == 0;

            //  Print results
            if (isLeapYear) {
                System.out.println("jaar " + year + " is WEL een schrikkeljaar");
            } else {
                System.out.println("jaar " + year + " is GEEN schrikkeljaar");
            }
        }
    }
}