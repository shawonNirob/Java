package learnExtends;

public class MountainBike extends Bicycle{
    public int height;
    public MountainBike(){
        super(56,58,59);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void printValue(){
        System.out.println("cadence : "+cadence);
        System.out.println("gear : "+gear);
        System.out.println("speed : "+speed);
        System.out.println("height : "+height);
    }

}
