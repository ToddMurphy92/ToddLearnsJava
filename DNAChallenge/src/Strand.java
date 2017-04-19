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

            //System.out.println("DEBUG - a.indexOf(b, index): " + a.indexOf(b, index));

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
        //System.out.println("DEBUG - Occurrences: " +  occurrences);
        //System.out.println("DEBUG - Found: " + found);

        // If no occurrences found sets occurrences to 1 (or the code will fail)
        if (found == false) {
            //System.out.println("DEBUG - Changing occurrences to 1...");
            occurrences = 1;
        }

        int[] array = new int[occurrences];     // Note min array length is 1 even if occurrences not found
        int arrayPosition = 0;
        index = 0;

        while (index != -1) {

            if (a.indexOf(b, index) > -1) {
                //System.out.println("DEBUG - Adding values to array...");
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

        String maxOverlapString = "";
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
                //System.out.println("DEBUG - Match found - Offset: " + offset);
                maxOverlapString = aSub;
            }

            offset++;
        }


        return maxOverlapString;
    }

    static public int[][] createLongestSubstringArray (String a, String b) {

        /**
         * String a corresponds with i
         * String b corresponds with j
         */

        //System.out.println("DEBUG LSSARRAY - Starting Method ...");
        int array [][] = new int [a.length() + 1][b.length() + 1];
        //System.out.println("DEBUG LSSARRAY b.length: " + b.length());

        for (int i = 0; i < array.length; i++) {          // for each row
            //System.out.println("DEBUG LSSARRAY - Starting for loop i ...");
            for (int j = 0; j < array[i].length; j++) {      // for each column
                //System.out.println("DEBUG LSSARRAY - Starting for loop j ...");
                //System.out.println("DEBUG LSSARRAY - i : " + i + "   j : " + j);
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

        //System.out.println("DEBUG LSSARRAY - Return array ... ");
        return array;
    }

    static public String printLongestSubstringArray (String a, String b) {
        return "Placeholder - Longest Substring Array";
    }

    static public int getLongestSubstringLength (String a, String b) {
        return 0;
    }

    static public String getLongestSubstringString (String a, String b) {

        /**
         * So what I want to do...
         *
         * Create an empty string.
         *
         * Start at bottom right of array.
         *
         * If Xmax = Ymax
         *  Move diagonal (up and left)
         * Else if X - 1 > Y - 1
         *  Move to X - 1
         * Else
         *  Move to Y - 1
         *
         */

        // Create empty string
        String returnString = "";

        int array[][] = Strand.createLongestSubstringArray(a, b);

        int yMax = array.length;        // y corresponds to i (String a) in the createLongestSubstringArray method
        int xMax = array[0].length;     // x corresponds to j (String b) in the createLongestSubstringArray method

        int yPosition = yMax;
        int xPosition = xMax;

        boolean solved = false;

        while (solved == false) {
            int left = yPosition - 1;
            int up = xPosition - 1;

            // We subtract -1 here because due to the 0's the actual characters in the array are all
            // shifted by +1
            // Look at the print out of the array and you will get what I mean
            // Or just study how dna sequencing works
            char yPositionChar = a.charAt(yPosition - 1); // Char on y axis at current yPosition
            char xPositionChar = b.charAt(xPosition - 1); // Char on x axis at current xPosition

            if (array[yPosition][xPosition] == 0) {
                solved = true;
            }
            else if (yPositionChar == xPositionChar) { // Run if true: string a position y is equal to string b position x

                // Adds the value at this position in the array to the start of our returnString
                // We add to the start and not the end because we work from the end of the string to the start
                // Should I use StringBuilder here instead? Need to investigate further
                returnString = (yPositionChar + returnString);

                // Diagonal position shift
                xPosition--;
                yPosition--;

            }
            else if (array[left][xPosition] > array[yPosition][up]) {
                yPosition = left;
            }
            else {
                // Remember we are moving the position up if
                // up > left OR
                // up == left
                // In the case of the latter it does not really matter which direction we move -
                // - as long as we are consistent
                // But we have to move one way so might as well go up
                xPosition = up;
            }

        }


        // Debug code
        System.out.println("DEBUG - xMax: " + xMax);
        System.out.println("DEBUG - yMax: " + yMax);

        // Return longest substring
        return returnString;
    }

}
