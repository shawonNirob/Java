package learnSuper;

public class SubCLass {

    double radius;
    String color;

    public SubCLass(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public SubCLass() {
        this.radius = 4;
        this.color = "RED";
    }

    public double getArea() {
        System.out.println("Radius: "+radius);
        System.out.println("Color: "+color);
        return radius * radius * Math.PI;
    }

}