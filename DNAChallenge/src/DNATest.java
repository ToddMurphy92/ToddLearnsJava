import java.util.Arrays;

/**
 * Created by todd on 25/3/17.
 */
public class DNATest {

    public static void main (String [] args) {

        String dna1 = "GTCGCTTAGAT";
        String dna2 = "AGTCGTCGTC";
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
         * Q4 / Q5 - Generate Array
         */
        System.out.println("Q4");
        int q4Array[][] = Strand.createLongestSubstringArray(dna1, dna2);
        System.out.println();
        String q4ArrayString = Arrays.deepToString(q4Array);

        /**
         * Q4 / Q5 - Print Array
         */
        for (int i = 1; i < q4ArrayString.length(); i++) {
            if (q4ArrayString.charAt(i) != ']') {
                System.out.print(q4ArrayString.charAt(i));
            }
            else {
                System.out.print("]\n");
                i++;
                i++;
            }
        }

        /**
         * Q4 - Answer
         */
        System.out.println();
        System.out.println("Q4 Answer - Longest substring: " + q4Array[dna1.length()][dna2.length()]);



        /**
         * DEBUG CODE
         */
        System.out.println();
        System.out.println("### DEBUG - DNATest.java ###");
        System.out.println("Array length: " + dnaMatches.length);
        System.out.println("dnaMatches[0] : " + dnaMatches[0]);
        System.out.println("");


    }

}
