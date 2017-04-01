/**
 * Created by todd on 25/3/17.
 */
public class Strand {

    /**
     * STRING MATCHING
     * @param a - A string representing a DNA strand
     * @param b - A string representing a DNA strand
     * @return  - An array of int that contains locations of where b is found in String a
     * @return  - If no occurrences were found returns -1 in an int array with length of 1
     */
    static public int[] match (String a, String b) {

        int occurrences = 0;        // Number of times b occurs within a
        int index = 0;              // See usage below
        boolean found = false;      // If any occurrences were found

        // Finds the number of occurrences of b within a. Value occurrences used later to create array size.
        while (index != -1) {

            System.out.println("DEBUG - a.indexOf(b, index): " + a.indexOf(b, index));

            // Runs for each occurrence found
            if (a.indexOf(b, index) > -1) {
                occurrences++;
                index = (a.indexOf(b, index) + 1);
                found = true;
            }

            // Runs when no more occurrences can be found. Ends the while loop.
            else {
                index = -1;
            }

        }
        System.out.println("DEBUG - Occurrences: " +  occurrences);
        System.out.println("DEBUG - Found: " + found);

        // If no occurrences found sets occurrences to 1 (or the code will fail)
        if (found == false) {
            System.out.println("DEBUG - Changing occurrences to 1...");
            occurrences = 1;
        }

        int[] array = new int[occurrences];     // Note min array length is 1 even if occurrences not found
        int arrayPosition = 0;
        index = 0;

        while (index != -1) {

            if (a.indexOf(b, index) > -1) {
                System.out.println("DEBUG - Adding values to array...");
                array[arrayPosition] = a.indexOf(b, index);     // Set array[arrayPosition] to position found after 'index'
                index = (a.indexOf(b, index) + 1);              // Increment index
                arrayPosition++;                                // Increment arrayPosition
            }

            // Sets array[0] to -1 if no occurrences were found
            else if (found == false) {
                array[0] = -1;
                index = -1;
            }
            else {
                index = -1;
            }

        }

        return array;

    }

    static public String maxOverlap (String a, String b) {

        String maxOverlapString = "Placeholder - Max Overlap";
        int overlap = 0;
        int offset = 1;
        String aSub;
        String bSub;

        //System.out.println("DEBUG - a at offset 1: " + a.substring(0, 1));
        //System.out.println("DEBUG - b at offset 1: " + b.substring((b.length()-1), b.length()));

        while (offset < a.length() && offset < b.length()) {
            //System.out.println("DEBUG - Begin while loop...");

            aSub = a.substring(0, offset);
            bSub = b.substring((b.length()-offset), b.length());

            //System.out.println("DEBUG - COMPARING aSub " + aSub + " to bSub " + bSub);

            if (aSub.equals(bSub)) {
                //System.out.println("DEBUG - Match found - Offset: " + offset);
                overlap = offset;
                maxOverlapString = aSub;
            }

            offset++;
        }

        if (overlap > 0) {
            offset = overlap;
        }

        while (offset < a.length() && offset < b.length()) {

            bSub = b.substring(0, offset);
            aSub = a.substring((a.length()-offset), a.length());

            //System.out.println("DEBUG - COMPARING aSub " + aSub + " to bSub " + bSub);

            // if ("Z" == "Z") {
            if (bSub.equals(aSub)) {
                System.out.println("DEBUG - Match found - Offset: " + offset);
                maxOverlapString = aSub;
            }

            offset++;
        }


        return maxOverlapString;
    }

    static public int[][] createLongestSubstringArray (String a, String b) {

        System.out.println("DEBUG LSSARRAY - Starting Method ...");
        int array [][] = new int [a.length() + 1][b.length() + 1];
        System.out.println("DEBUG LSSARRAY b.length: " + b.length());

        for (int i = 0; i < array.length; i++) {          // for each row
            System.out.println("DEBUG LSSARRAY - Starting for loop i ...");
            for (int j = 0; j < array[i].length; j++) {      // for each column
                System.out.println("DEBUG LSSARRAY - Starting for loop j ...");
                System.out.println("DEBUG LSSARRAY - i : " + i + "   j : " + j);
                if (i > 0 && j > 0) {                   // Skip first row and first column
                    if (a.charAt(i - 1) == b.charAt(j - 1)) {
                        array[i][j] = ( array[i - 1][j - 1] + 1 );
                    }
                    else {
                        array[i][j] = Math.max(array[i - 1][j], array[i][j - 1]);
                    }
                }
            }
        }
        System.out.println("DEBUG LSSARRAY - Print array ... ");
        System.out.println("");

        System.out.println("DEBUG LSSARRAY - Return array ... ");
        return array;
    }

    static public String printLongestSubstringArray (String a, String b) {
        return "Placeholder - Longest Substring Array";
    }

    static public int getLongestSubstringLength (String a, String b) {
        return 0;
    }

    static public String getLongestSubstringString (String a, String b) {
        return "Placeholder - Longest Substring String";
    }

}
