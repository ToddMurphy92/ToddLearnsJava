import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by todd on 25/2/17.
 */
public class ArrayExample2 {

    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        boolean keepGettingThemValues = true;

        ArrayList<Integer> myArr = new ArrayList<>();

        System.out.println("Add a value to the array: ");
        myArr.add(input.nextInt());

        while (keepGettingThemValues == true) {

            System.out.println("Would you like to add another value to the array? true / false");
            keepGettingThemValues = input.nextBoolean();

            if (keepGettingThemValues == true){
                System.out.println("Enter the array value: ");
                myArr.add(input.nextInt());
            }

        }

        System.out.print("Array: ");
        for (int count = 0; count < myArr.size(); count++){
            System.out.print(myArr.get(count));

            if (count + 1 < myArr.size()){
                System.out.print(", ");
            }

        }

    }

}
