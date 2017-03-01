/**
 * Created by todd on 25/2/17.
 */
public class LargestArrayValue {
    public static void main (String [] args){

        int [] myNumbers = {120, 3, 930, 109, 827, 901};
        int highestNum = 0;

        for (int i = 0; i < myNumbers.length; i++) {
            if (highestNum < myNumbers[i]){
                highestNum = myNumbers[i];
            } //end if
        } // end for loop

        System.out.print(highestNum);

    }
} // end class
