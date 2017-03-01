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
            System.out.println(someSaying.charAt(i));
        }


        System.out.println(someSaying.replace("e","x"));

        System.out.println(someSaying.replace("unique","funny"));

        System.out.println(someSaying.indexOf("i"));

        System.out.println(someSaying.lastIndexOf("i"));

        String x = "Exit";
        System.out.println(x.equalsIgnoreCase("EXIT"));

        String z = "Have 3 extra spaces in this string   ";
        System.out.println(z.length());
        System.out.print(z.trim().length());

    }

}
