/**
 * Created by todd on 1/3/17.
 */
public class StringsMakeSense {

    public static void main (String [] args) {

        String someSaying = new String ("You are unique like everyone else");

        System.out.println(someSaying);

        System.out.println(
                        someSaying.toLowerCase() + "\n" +
                        someSaying.toUpperCase() + "\n" +
                        someSaying.length() + "\n" +
                        someSaying.charAt(23) + "\n" +
                        someSaying.charAt(24) + "\n"
        );

        for (int i=0; i < 4; i++){
            System.out.print(someSaying.charAt(i));
        }

    }

}
