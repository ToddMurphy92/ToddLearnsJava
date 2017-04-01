/**
 * Created by todd on 25/3/17.
 */
public class DNATest {

    public static void main (String [] args) {

        String dna1 = "ZYXWA";
        String dna2 = "WAUVZ";
        int[] dnaMatches;

        dnaMatches = Strand.match(dna1, dna2);

        /**
         * Q1 Solution
         */
        System.out.println("Q1");

        if (dnaMatches[0] > -1) {
            System.out.println("Matches found: " + dnaMatches.length);
        }
        else {
            System.out.println("No matches found.");
        }

        /**
         * Q2 Solution
         */
        System.out.println("Q2");

        if (dnaMatches[0] > -1) {
            System.out.print("Matches found at locations: ");
            for (int i = 0; i < dnaMatches.length; i++) {
                System.out.print(dnaMatches[i]);
                if (i < (dnaMatches.length -1)) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();

        /**
         * Q3 Solution
         */
        System.out.println("Q3");
        System.out.println("Max overlap: " + Strand.maxOverlap(dna1, dna2));

        /**
         * Q4
         */
        System.out.println("Q4");
        System.out.println("Max overlap length: " + Strand.maxOverlap(dna1, dna2).length());


        /**
         * DEBUG CODE
         *
        System.out.println();
        System.out.println("### DEBUG - DNATest.java ###");
        System.out.println("Array length: " + dnaMatches.length);
        System.out.println("Array[0] : " + dnaMatches[0]); */


    }

}
