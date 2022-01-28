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
