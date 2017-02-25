/**
 * Created by todd on 25/2/17.
 */
public class CountBy3 {

    public static void main (String [] args){

        for (int count = 1; count <=100; count++){
            System.out.print(count * 3 + ", ");

            if (count * 3 % 30 == 0) {
                System.out.println();
            }

        }

    }

}
