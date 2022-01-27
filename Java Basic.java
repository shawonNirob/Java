package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.print("Hello world!\n");
        System.out.print("this is my first java program\t");
        System.out.print("How are you?\t");
        System.out.println("I am Nirob.");
        System.out.println("1813010");
    }
}
//
package com.company;

public class Main {

    public static void main(String[] args) {
        int var = 3000;

        System.out.println("value of var = " + var);
    }
}
//
package com.company;

public class Main {

    public static void main(String[] args) {
       double var = 3000.58;

        System.out.println("value of var = " + (var * 1000));
    }
}
//
package first_package;

public class Java {
    public static void main(String[] args) {
        myClass objectVariable = new myClass();
        objectVariable.myFunction();
        objectVariable.myFunction2();

    }
}
/
    package first_package;

public class myClass {
    public void myFunction(){
        System.out.println("Handle myfunction");
    }
    public void myFunction2(){
        System.out.println("Handle myFunction2");
    }

}
