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

        System.out.println("DEBUG - a at offset 1: " + a.substring(0, 1));
        System.out.println("DEBUG - b at offset 1: " + b.substring((b.length()-1), b.length()));

        while (offset < a.length() && offset < b.length()) {
            System.out.println("DEBUG - Begin while loop...");

            aSub = a.substring(0, offset);
            bSub = b.substring((b.length()-offset), b.length());

            System.out.println("DEBUG - COMPARING aSub " + aSub + " to bSub " + bSub);

            // if ("Z" == "Z") {
            if (aSub.equals(bSub)) {
                System.out.println("DEBUG - Match found - Offset: " + offset);
                overlap = offset;
                maxOverlapString = aSub;
            }

            offset++;
        }

        if (overlap > 0) {
            offset = overlap;
        }

        while (offset < a.length() && offset < b.length()) {

            offset++;
        }


        return maxOverlapString;
    }

    static public String longestSubstring (String a, String b) {
        return "Placeholder - Longest Substring";
    }


}
