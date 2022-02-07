package learnSuper;

public class Cylinder extends SubCLass {
        double height;

        public Cylinder() {
            this.height = 7.0;
        }

        public Cylinder(double radius, String color, double height) {
            super(radius, color);
            this.height = height;
        }

        public double getArea() {
            System.out.println("Height: "+height);
            double area = 2 * Math.PI * radius * radius + 2 * super.getArea();
            return area;
        }
    }
