import java.util.Scanner;

/**
 * Created by todd on 24/2/17.
 */
public class chargeCalculator {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        // ### VARIABLES
        // Payment method charge multipliers
        double paymentCash = 1.0;
        double paymentCreditCard = 1.015;
        double paymentPayPal = 1.026;
        double taxationAmount = 1.10;
        double paymentMultiplier = 0.0;
        // Other Variables
        int paymentMethod = 0;
        double price = 0.0;
        double costRaw = 0.0;
        double costRounded = 0.0;

        // Get price
        System.out.println("Item price: ");
        price = input.nextDouble();

        // Get payment method
        System.out.println("Please enter your payment method (1=cash, 2=credit card, 3=paypal): ");
        paymentMethod = input.nextInt();

        // Set payment multiplier

        if (paymentMethod == 2){
            paymentMultiplier = paymentCreditCard * taxationAmount;
        }
        else if (paymentMethod == 3){
            paymentMultiplier = paymentPayPal * taxationAmount;
        }
        else {
            paymentMultiplier = taxationAmount;
        }

        // Cost raw data before rounding
        costRaw = price * paymentMultiplier;
        System.out.println("Total cost before rounding: " + costRaw);

        // Cost in real currency
        System.out.println("Total to be charged in real currency: $" + costRounded);


    }

}
