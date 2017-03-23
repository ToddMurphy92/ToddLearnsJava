/**
 * Created by todd on 23/3/17.
 */
public class MobilePhone {

    private boolean powerStatus = false;        // True = Power is on
    private boolean callStatus = false;         // True = On call (busy)
    private String selfNumber;  // Number of the phone
    private int speedDialListSize = 0;
    private String speedDialList [];


    public MobilePhone (String selfNumber, int speedDialListSize) {
        this.selfNumber = selfNumber;
        this.speedDialListSize = speedDialListSize;
        this.powerStatus = false;
        this.callStatus = false;

        this.speedDialList [this.speedDialListSize];
    }

    // METHODS TO OBTAIN DATA


    // METHODS TO ACCOMPLISH A TASK

    public void powerButton () {
        this.powerStatus ^= true;
        this.callStatus = false;
    }

    public void hangUp () {
        this.callStatus ^= true;
    }

    public void addToSpeedDial (String newSpeedDialNum, int numPosition) {
        if (numPosition >= 0 && numPosition <= this.speedDialList.length) {
            this.speedDialList [numPosition] = newSpeedDialNum;
        }
    }
     

}
