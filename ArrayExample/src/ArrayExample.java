/**
 * Created by todd on 25/2/17.
 */
public class ArrayExample {

    public static void main (String [] poopBumHole) {

        int [] intArray;
        intArray = new int [10];

        for (int count = 0; count < intArray.length; count++){
            System.out.print(intArray[count]);

            if (count + 1 < intArray.length){
                System.out.print(", ");
            }

        }

    } // end main

} // end class
