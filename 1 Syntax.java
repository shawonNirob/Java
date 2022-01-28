//
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
//
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
//
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
//
      
      
