//Package Class
ackage com.one.java.syntax;

public class Syntax {
    public static void main(String[] args) {
        Calculation value = new Calculation();
        System.out.println(""+value.performAddition(4,6));
        System.out.println(""+value.performSubtraction(6,3));
    }
}
/
package com.one.java.syntax;

public class Calculation {
    int performAddition(int a, int b){
        int result = a+b;
        return result;
    }
    int performSubtraction(int a, int b){
        int result = a-b;
        return result;
    }
}
/
package com.one.java.syntax;

private class Calculation {
    int performAddition(int a, int b){
        int result = a+b;
        return result;
    }
    int performSubtraction(int a, int b){
        int result = a-b;
        return result;
    }
}
/
package com.one.java.syntax;

protected class Calculation {
    int performAddition(int a, int b){
        int result = a+b;
        return result;
    }
    int performSubtraction(int a, int b){
        int result = a-b;
        return result;
    }
}
//import Scanner
package com.one.java.syntax;
import java.util.Scanner;
public class Syntax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter ypur text: ");
        String p= input.nextLine();
        Calculation value1 = new Calculation();
        value1.printString(p);



        Calculation value = new Calculation();
        System.out.println(""+value.performAddition(4,6));
        System.out.println(""+value.performSubtraction(6,3));
    }
}
//method
package com.one.java.syntax;

public class Calculation {
    int performAddition(int a, int b){
        int result = a+b;
        return result;
    }
    int performSubtraction(int a, int b){
        int result = a-b;
        return result;
    }
    void printString(String a){
        System.out.println(""+a);
    }
}
//
package com.one.java.syntax;

public class Calculation {
    public void printText(String text1, String text2) {
        System.out.println(text1 + text2);
    }

    public void writeText(String a, String b) {
        System.out.println(a+b);
    }

    public int sum(int value1, int value2) {
        return value1 + value2;
    }

    public String concat(String value1, String value2)
    throws IllegalArgumentException {
        if (value1 == null || value2 == null) {
            throw new IllegalArgumentException("value is null");
        }
        return value1 + value2;
    }

    public static void main(String[] args) {
        Calculation myObject = new Calculation();
        myObject.printText("I am ", "Nobody");
        myObject.writeText("who", "are you?");
        System.out.println(myObject.sum(45,78));
        System.out.println(myObject.concat("", "Home"));
    }
}
//object
package com.one.java.syntax;
import java.util.Scanner;
public class BicycleDemo {
    public static void main(String[] args) {
        Syntax bike1 = new Syntax();
        Syntax bike2 = new Syntax();
        Syntax bike3 = new Syntax();
        Syntax bike4 = new Syntax();

        System.out.println("speedup "+bike1.speedUp(40));
        System.out.println("speed increment "+bike2.speedUp(50));
        bike1.changeCadence(60);
        System.out.println("Change Gear "+bike3.changeGear(65));
        System.out.println("Top Speed "+bike4.topValue(45, 4));

    }
}
/package com.one.java.syntax;

public class Syntax {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int value) {
        cadence = value;
        System.out.println("Cadence"+cadence);
    }

    int changeGear(int value) {
        speed = value;
        return value;
    }

    int speedUp(int increment) {
        speed = speed + increment;
        return increment;
    }

    void applyBike(int decrement) {
        speed = speed - decrement;
        System.out.println("speed="+decrement);
    }

    int topValue(int time, int km) {
        speed = km / time;
        return speed;
    }
}
//
package com.one.java.syntax;
import java.util.Scanner;
public class BicycleDemo {
    public static void main(String[] args) {
        Syntax bike1 = new Syntax();
        Syntax bike2 = new Syntax();
        Syntax bike3 = new Syntax();
        Syntax bike4 = new Syntax();

        System.out.println(bike1.changeChadence(45,65,36));
        bike2.changeChadence(98);
        System.out.println(bike4.changeChadence(45, 69));

    }
}
/
package com.one.java.syntax;

public class Syntax {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeChadence(int value) {
        cadence = value;
        System.out.println("Cadence"+cadence);
    }


    float changeChadence(float time, float km) {
        float p = km / time;
        return p;
    }
    int changeChadence(int km, int time, int num) {
        speed = km / time +num ;
        return speed;
    }

}
//
package com.one.java.syntax;
import java.util.Scanner;
public class BicycleDemo {
    public static void main(String[] args) {
        Syntax bike1 = new Syntax();
        Syntax bike2 = new Syntax();
        Syntax bike3 = new Syntax();
        Syntax bike4 = new Syntax();

        System.out.println(bike1.changeChadence(45,65,36));
        bike2.changeChadence(98);
        System.out.println(bike4.changeChadence(45, 69));

    }
}
/
package com.one.java.syntax;

public class Syntax {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeChadence(int value) {
        cadence = value;
        System.out.println("Cadence"+cadence);
    }


    float changeChadence(float time, float km) {
        float p = km / time;
        return p;
    }
    int changeChadence(int km, int time, int num) {
        speed = km / time +num ;
        return speed;
    }
    int changeChadence(int km, int num) {
        speed = km + num ;
        return speed;
    }

}
//constractor
package com.one.java.syntax;
import javax.naming.Name;
import java.util.Scanner;
public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id){
        this.id =id;
    }
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    public Student(int id, String name,int age){
        this.id = id;
        this.name =name;
        this.age = age;

    }
  }
  //
  public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int studentId, String studentName,int studentAge){
        id = studentId;
        name = studentName;
        age = studentAge;

    }
  //constructor
  package first_package;

public class myClass {
    int sum;

    public myClass(){
        this(5,2);
    }
    public myClass(int n1, int n2){
        this.sum=n1+n2;
    }
    void display(){
        System.out.println("sum: "+sum);
    }

    public static void main(String[] args) {
        myClass call = new myClass();
        call.display();
    }
}
//constructor
package first_package;

import javax.imageio.stream.ImageInputStream;

public class myClass {
    private int id;
    private String name;
    private double marks;

    public myClass(int id) {
        this.id = id;
    }

    public myClass(int id, double marks) {
        this.id = id;
        this.marks = marks;
    }

    public myClass(int id, double marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }
    void display1() {
        System.out.println("id=" + id);
    }

    void display2() {
        System.out.println("id=" + id + "\tmarks " + marks);
    }

    void display3() {
        System.out.println("id=" + id + "\tname=" + name + "\tmarks " + marks);
    }

    public static void main(String[] args) {
        myClass call1 = new myClass(5);
        myClass call2 = new myClass(6, 56.5);
        myClass call3 = new myClass(7, 75.6, "Nirob");
        call1.display1();
        call2.display2();
        call3.display3();
    }
}
//constructor
//The main purpose of the constractor is initiallize the object
//Every java class has a constractor(default constractor)
//A constractor is autometically called at the time of object creation
//non return type
package first_package;

import javax.imageio.stream.ImageInputStream;

public class myClass {
    private int id;
    private String name;
    private double marks;
    /*
    public myClass(int id) {
        this.id = id;
    }

    public myClass(int id, double marks) {
        this.id = id;
        this.marks = marks;
    }

    public myClass(int id, double marks, String name) {
        this.id = id;
        this.marks = marks;
        this.name = name;
    }

     */
    void display1() {
        System.out.println("id=" + id);
    }

    void display2() {
        System.out.println("id=" + id + "\tmarks " + marks);
    }

    void display3() {
        System.out.println("id=" + id + "\tname=" + name + "\tmarks " + marks);
    }

    public static void main(String[] args) {
        myClass call1 = new myClass();
        myClass call2 = new myClass();
        myClass call3 = new myClass();
        call1.display1();
        call2.display2();
        call3.display3();
    }
}
//getter/setter
package first_package;

public class myClass {
    private int id;
    private String name;
    private double marks;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    public double getMarks(){
        return marks;
    }
    public void setMarks(double marks){
        this.marks =marks;
    }
    public static void main(String[] args) {
        myClass objEarn = new myClass();
        objEarn.setId(1813010);
        System.out.println("ID: "+objEarn.getId());
        objEarn.setName("Nirob");
        System.out.println("NAME: "+objEarn.getName());
        objEarn.setMarks(45);
        System.out.println("MARKS: "+objEarn.getMarks());

    }
}
//static method
package first_package;
import java.util.Scanner;
public class myClass {
  public static int square(int n){
      return n*n;
  }

  public static void main(String[] args) {
      Scanner input =new Scanner(System.in);
      System.out.println("Please enter a number: ");
      int number =input.nextInt();
      int square1 = myClass.square(number);
      System.out.println("square: "+ square1);
  }
}
//Non-static method
package first_package;

public class Circle {
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }
    public double Calculation(){
        return radius * radius * Math.PI;
    }

    public static void main(String[] args) {
        Circle areaSolution = new Circle(10);
        System.out.println("Area "+ areaSolution.Calculation());
    }
}
//Import other Class another Package
//Specific importing
import com.one.java.syntax.BicycleDemo;

//Wildcard importing
//import other package's all class in a single package
import com.one.java.syntax.*
/**
Close
*/
