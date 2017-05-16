/**
 * Created by todd on 18/3/17.
 */
public class Dog {

    String name = new String();
    String breed = new String();
    int age;
    int lives = 10;
    boolean alive = true;
    int legs = 4;

    public Dog (String name, String breed, int age) {

        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void killDog() {

        this.alive = false;
        System.out.println("Oh no you just killed " + this.name + " :(");

    }

}
