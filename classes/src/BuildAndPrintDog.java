/**
 * Created by todd on 4/3/17.
 */
public class BuildAndPrintDog {

    public static void main (String [] args) {
        Dog d1 = new Dog ("Jet", "Poodle", 14);
        Dog d2 = new Dog ("Bella", "Poodle", 9);

        // Below line will not work while private is specified for the name string in the Dog class
        // d2.name = "Obama";

        System.out.println(d1);
        System.out.println(d2);

    }


}
