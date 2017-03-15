/**
 * Created by todd on 11/3/17.
 */
public class TestTV {

    public static void main (String [] args) {

        // Create Samsung TV
        TV samsung = new TV();


        // Change TV settings
        samsung.channelToNum(0);
        samsung.channelDownNum();
        samsung.channelDownNum();
        samsung.volumeChange(false);
        samsung.volumeChange(false);
        samsung.powerStateChange();


        // Print TV settings
        System.out.println(
                "Channel: " + samsung.channelStatus() + "\n" +
                "Volume: " + samsung.volumeStatus() +  "\n" +
                "Power Status: " + samsung.powerStateStatus()
        );

    }

}
