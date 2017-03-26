/**
 * Created by todd on 25/3/17.
 */
public class Strand {

    /**
     * STRING MATCHING
     * @param a - A string representing a DNA strand
     * @param b - A string representing a DNA strand
     * @return  - An array of int that contains locations of where a is found in String b
     */
    static public int[] match (String a, String b) {

        int occurrences = 0;
        int index = 0;
        boolean found = false;
        System.out.println("DEBUG - a: " + a);
        System.out.println("DEBUG - b: " + b);
        String testA = a;
        String testB = b;

        while (index != -1) {

            System.out.println("DEBUG - b.indexOf(a, index): " + b.indexOf(a, index));
            System.out.println("DEBUG - testB.indexOf(testA, index): " + testB.indexOf(testA, index));
            System.out.println("DEBUG - b.indexOf(A, index): " + testB.indexOf("A", index));

            if (b.indexOf(a, index) > -1) {
                occurrences++;
                index++;
                found = true;
            }
            else {
                index = -1;
            }

        }
        System.out.println("DEBUG - Occurrences: " +  occurrences); // DEBUG
        System.out.println("DEBUG - Found: " + found);

        if (found == false) {
            System.out.println("DEBUG - Changing occurrences to 1...");
            occurrences = 1;
        }

        int[] array = new int[occurrences];
        int arrayPosition = 0;

        for (int i = 0; i < array.length; i++) {

            if (b.indexOf(a, i) > -1) {
                array[arrayPosition] = b.indexOf(a, i);
                arrayPosition++;
            }
            else {
                array[0] = -1;
            }

        }

        return array;

    }

    static public String maxOverlap (String a, String b) {
        return "String";
    }

    static public String longestSubstring (String a, String b) {
        return "String";
    }


}
