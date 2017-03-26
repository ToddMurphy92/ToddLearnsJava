/**
 * Created by todd on 25/3/17.
 */
public class DNATest {

    public static void main (String [] args) {

        String dna1 = "AAA";
        String dna2 = "A";
        int[] dnaMatches;

        dnaMatches = Strand.match(dna1, dna2);

        /**
         * Q1 Solution
         */
        if (dnaMatches[0] > -1) {
            System.out.println("Matches found: " + dnaMatches.length);
        }
        else {
            System.out.println("No matches found.");
        }

        /**
         * Q2 Solution
         */

        if (dnaMatches[0] > -1) {
            System.out.print("Matches found at locations: ");
            for (int i = 0; i < dnaMatches.length; i++) {
                System.out.println(dnaMatches[i] + ", ");
            }
        }

        /**
         * DEBUG CODE
         */
        System.out.println();
        System.out.println("### DEBUG - DNATest.java ###");
        System.out.println("Array length: " + dnaMatches.length);
        System.out.println("Array: " + dnaMatches[0]);


    }

}
