import java.util.Scanner;

/**
 * Created by todd on 24/2/17.
 */
public class YouTellMe {

    public static void main (String [] args){

        // System Variables
        //int countNumbers = 5;
        //int countLines = 5;
        // User Variables
        // int desiredNumbers = 0;
        // int desiredLines = 0;
        int number = 0;
        int printNumber = 0;

        Scanner input = new Scanner(System.in);

        // Get numbers per line
        System.out.println("How many numbers per line would you like to print?");
        int desiredLines = input.nextInt();

        // Get lines
        System.out.println("How many lines would you like to print?");
        int desiredNumbers = input.nextInt();

        // Print numbers
        // For statement that helps print lines
        for (int countLines = 0; countLines < desiredLines; countLines++){

            // For statement at creates and prints individual lines
            for (int countNumbers = 1; countNumbers <= desiredNumbers; countNumbers++){
                printNumber = countNumbers + number;
                System.out.print(printNumber);

                if (printNumber < desiredLines * desiredNumbers){
                    System.out.print(", ");
                }
            }

            System.out.println();

            number = number + desiredNumbers;

        }

        // All done
        System.out.println("All done");

    }

}
