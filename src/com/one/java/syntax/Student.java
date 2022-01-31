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

    public static void main(String[] args) {
        System.out.println("Integer.MAX_VALUE = "
                + Integer.MAX_VALUE);
        System.out.println("Integer.MIN_VALUE = "
                +Integer.MIN_VALUE);

    }
}
