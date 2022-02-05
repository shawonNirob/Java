//Extended class
package learnExtends;

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public void setCadence(int newValue){
        cadence = newValue;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void setSpeed(int newValue){
        speed -=newValue;
    }
    public class MountainBike extends Bicycle{
        public int setHeight;
        public void setSetHeight(int newValue){
            setHeight = newValue;
        }
    }
}
//
package learnExtends;

public class Bicycle {
    public int cadence;
    public int gear;
    public int speed;

    public Bicycle(int cadence, int gear, int speed){
      this.cadence=cadence;
      this.gear=gear;
      this.speed=speed;
    }
    public void setCadence(int newValue){
        cadence = newValue;
    }
    public void setGear(int newValue){
        gear = newValue;
    }
    public void setSpeed(int newValue){
        speed -=newValue;
    }
    public class MountainBike extends Bicycle{
        public int setHeight;
        public void setSetHeight(int newValue){
            setHeight = newValue;
        }
    }
}
//Inheritence
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

/
package learnExtends;

public class MountainBike extends Bicycle {
    public int height;

    public MountainBike() {
        super(56, 58, 59);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printValue() {
        System.out.println("cadence : " + cadence);
        System.out.println("gear : " + gear);
        System.out.println("speed : " + speed);
        System.out.println("height : " + height);
    }

}
/
package learnExtends;

public class ParentMain {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike();
        mountainBike.setHeight(200);
        mountainBike.printValue();
    }
}
//
