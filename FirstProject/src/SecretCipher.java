/**
 * Created by todd on 18/2/17.
 */
import java.util.Scanner;

public class SecretCipher {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);

        // Get message
        System.out.println("Enter a message you sly doggo...");

        String message = input.nextLine();

        String output = "";

        // Get shift value
        System.out.print("Enter a secret key (-26 to 26): ");
        int readInt = input.nextInt();
        char key = (char)readInt;
        // char key = 13;

        // Encrypt message

        for (int x = 0; x < message.length(); x++){
            char c = message.charAt(x);
            // encode/decode capitals
            if (c >= 'A' && c<= 'Z'){
                c += key;

                if (c > 'Z'){
                    c -= 26;
                }
                else if (c < 'A'){
                    c += 26;
                }
            }
            // encode lowercase
            else if (c >= 'a' && c<= 'z'){
                c += key;

                if (c > 'z'){
                    c -= 26;
                }
                else if (c < 'a'){
                    c += 26;
                }
            }

            output += c;
        }

        // Print entire message (variable 'output')
        System.out.print(output);

        // Print encrypted message
        // System.out.println(message);

    }
}