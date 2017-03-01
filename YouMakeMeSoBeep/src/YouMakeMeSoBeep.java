/**
 * Created by todd on 25/2/17.
 */
public class YouMakeMeSoBeep {

    public static void main (String [] args){
        int desiredBeeps = 50;

        for (int count = 0; count < desiredBeeps; count++) {
            java.awt.Toolkit.getDefaultToolkit().beep();
            try {
                Thread.sleep(200L);
            }
            catch (Exception e) {}
        }

    }

}
