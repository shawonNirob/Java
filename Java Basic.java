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
//
// enter a input 
package first_package;

public class Java {
    public static void main(String[] args) {
        myClass objectVariable = new myClass();
        objectVariable.inputNew();

    }
}
/
package first_package;

import java.util.Scanner;

public class myClass {
    public void inputNew(){
        //Create objectof Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        //Take in input
        int a = input.nextInt();
        System.out.println("Enter another number: ");
        int b = input.nextInt();
        int result = a + b;
        System.out.println("The result: " + result);
        //Close Scanner
        input.close();

    }

}
/
    package first_package;

import java.util.Scanner;

public class myClass {
    public void inputNew(){
        //Create object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a double data: ");
        //Take in input
        double a = input.nextDouble();
        System.out.println("Enter another number: ");
        double b = input.nextDouble();
        double result = a + b;
        System.out.println("The result: " + result);
        //Close Scanner
        input.close();

    }

}
/
package first_package;

import java.util.Scanner;

public class myClass {
    public void inputNew(){
        //Create object of Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text ");
        //Take in input
        String a = input.nextLine();
        System.out.println("Enter another text ");
        String b = input.nextLine();
        System.out.println("The result: " + a +b);
        //Close Scanner
        input.close();
    }

}
//
 
package binary_search;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;
        System.out.println(search(nums, target));
    }

    /*public static int search(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }*/
    public static int search(int[] nums, int target) {

        /*if (nums.length == 0) {
            return -1;
        }

        if (nums.length == 1) {
            if (nums[0] != target) {
                return -1;
            } else {
                return 0;
            }
        }*/

        int l = 0;
        int h = nums.length-1;
        int mid;

        while (l <= h) {
            mid = l + (h - l) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                h = mid - 1;
            }
        }
        return -1;
    }
}
//
package reverse_array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int temp,var;
        int[] nums = new int[]{1,2,3,4,5,6,7,8,9};
        for(int i=0; i< nums.length; i++){
            temp=nums[i];
            var=nums[(nums.length-1)-i];
            nums[i]=var;
            nums[(nums.length-1)-i]=temp;
            if(i== (nums.length-1)/2){
                break;

            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
//

