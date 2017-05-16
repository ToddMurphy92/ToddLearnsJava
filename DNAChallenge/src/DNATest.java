import java.util.Arrays;

/**
 * Created by todd on 25/3/17.
 */
public class DNATest {

    public static void main (String [] args) {

        // GTCGCTTAGAT
        // AGTCGTCGTC
        // ACCTTAAGGT


        String dna1 = "ACCTTAAGGT";
        String dna2 = "AGTCGTCGTC";
        int[] dnaMatches;

        /**
         * Pre-Question Info
         */
        System.out.println("dna1: " + dna1);
        System.out.println("dna2: " + dna2 + "\n");

        /**
         * Q1 Solution
         */
        System.out.println("----- Q1 -----");

        dnaMatches = Strand.match(dna1, dna2);

        if (dnaMatches[0] > -1) {
            System.out.println("Matches found: " + dnaMatches.length);
        }
        else {
            System.out.println("No matches found");
        }

        System.out.println();

        /**
         * Q2 Solution
         */
        System.out.println("----- Q2 -----");

        if (dnaMatches[0] > -1) {
            System.out.print("Matches found at locations: ");
            for (int i = 0; i < dnaMatches.length; i++) {
                System.out.print(dnaMatches[i]);
                if (i < (dnaMatches.length -1)) {
                    System.out.print(", ");
                }
            }
        }
        else {
            System.out.println("No matches found");
        }

        System.out.println();

        /**
         * Q3 Solution
         */
        System.out.println("----- Q3 -----");
        System.out.println("Max overlap: " + Strand.maxOverlap(dna1, dna2) + "\n");

        /**
         * Q4 / Q5 - Generate Array
         */
        System.out.println("----- Q4 -----");
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
        System.out.println("Q4 Answer - Longest substring: " + q4Array[dna1.length()][dna2.length()] + "\n");

        /**
         * Q5 - Answer
         */
        System.out.println("----- Q5 -----");

        String longestSubstring = Strand.getLongestSubstringString(dna1, dna2);

        System.out.println("Longest Substring string: " + longestSubstring);


        /**
         * Q6 - Answer
         */
        System.out.println("\n----- Q6 -----");

        boolean isPalindrome = false;

        // Calculate if A is a palindrome

        isPalindrome = Strand.getIsPalindrome(dna1);

        // run method HERE

        System.out.println("--- Strand 1 ---");
        if (isPalindrome) {
            System.out.println("PALINDROME FOUND: True");
        }
        else {
            System.out.println("PALINDROME FOUND: False");
        }



        /**
         * DEBUG CODE
         */
        System.out.println();
        System.out.println("### DEBUG - DNATest.java ###");
        System.out.println("Array length: " + dnaMatches.length);
        System.out.println("dnaMatches[0]: " + dnaMatches[0]);


    }

}
