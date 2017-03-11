/**
 * Created by todd on 3/3/17.
 */
public class TestLoop {

    public static void main(String[] args) {

        int i = 0;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while(i != 7);

        System.out.println(i);
        System.out.println(sum);

    }
}