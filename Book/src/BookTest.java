/**
 * Created by todd on 18/3/17.
 */
public class BookTest {

    public static void main (String args []) {

        Book aFeastForCrows = new Book( "A Feast For Crows", "Fourth book in ASOIAF series", 2005, "0-553-80150-3", "Voyager Books");
        Book windsOfWinter = new Book ("Winds of Winter", "Sixth book in ASOIAF series", 2017);

        System.out.println("First book title: " + aFeastForCrows.title);
        System.out.println("Second book title: " + windsOfWinter.title);

        System.out.println("Giving the second book a publisher and ISBN....");
        windsOfWinter.setIsbn("01234");
        windsOfWinter.setPublisher("Todd's Publishing House");

        System.out.println("Second book publisher:" + windsOfWinter.getPublisher());
        System.out.println("Second book ISBN:" + windsOfWinter.getIsbn());


    }


}
