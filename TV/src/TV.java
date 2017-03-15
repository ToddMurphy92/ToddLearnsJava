/**
 * Created by todd on 11/3/17.
 */
public class TV {

    // ATTRIBUTES
    int channel;
    int volume;
    boolean power;


    // CONSTRUCTOR
    public TV () {

        this.channel = 2;
        this.volume = 10;
        this.power = false;

    }

    // METHODS
    // Method - powerStateChange
    public void powerStateChange () {
        power = !power;
    }

    // Method - powerStateStatus
    public boolean powerStateStatus () {
        return power;
    }

    // Method - channelUpNum
    public void channelUpNum () {
        this.channel++;

        if (this.channel > 99) {
            this.channel = 0;
        }

    }

    // Method - channelDownNum
    public void channelDownNum () {
        this.channel--;

        if (this.channel < 0) {
            this.channel = 99;
        }

    }

    // Method - channelToNum
    public void channelToNum (int channel) {
        if (channel <= 99 && channel >= 0) {
            this.channel = channel;
        }
    }

    // Method - channelStatus
    public int channelStatus () {
        return this.channel;
    }

    // Method - changeVolume
    public void volumeChange (boolean up) {

        if (up == true) {
            this.volume++;
        }
        else {
            this.volume--;
        }

        if (this.volume > 20) {
            this.volume = 20;
        }

        if (this.volume < 0) {
            this.volume = 0;
        }

    }

    // Method - volume - Returns volume value
    public int volumeStatus () {
        return this.volume;
    }


}
