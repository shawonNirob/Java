package com.one.java.syntax;
import java.util.Scanner;
public class BicycleDemo {
    public int reverse(int n){
        int r, sum=0;
        while(n!=0){
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n =input.nextInt();
        BicycleDemo reverseInteger = new BicycleDemo();
        System.out.println("num: " +reverseInteger.reverse(n));
    }
}
