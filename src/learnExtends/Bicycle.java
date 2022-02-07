package learnExtends;

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int cadence, int gear, int speed) {
        this.cadence = cadence;
        this.gear = gear;
        this.speed = speed;
    }

    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void setSpeed(int newValue) {
        speed -= newValue;
    }
}
