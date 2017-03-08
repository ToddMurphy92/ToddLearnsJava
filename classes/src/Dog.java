/**
 * Created by todd on 4/3/17.
 */
public class Dog {

    // attributes
    private String name;
    private String breed;
    private int age;
    // end attributes

    // constructor
    public Dog (String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    } // end constructor Dog

    // method
    public String toString() {
        return "Name: " + name + " Breed: " + breed + " Age: " + age;
    } // end method toString


} // end class Dog
