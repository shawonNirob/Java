package learnSuper;

public class SportCar extends Car {
    int speed = 100;

    public SportCar(){
        super(95);
    }
    public void printSpeed() {
        super.printSpeed();
        System.out.println("Speed: " +speed);
    }
}
