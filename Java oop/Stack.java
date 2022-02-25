package dataStructure.learnStack;

import java.util.Stack;

public class StackLeetCode {
    public static void main(String[] args) {
        Stack<String> language = new Stack<>();
         language.add("C");
         language.add("C++");
         language.add("Python");
         language.add("Java");

        System.out.println(language.pop());
        System.out.println(language.peek());
        System.out.println(language.push("Go"));

        System.out.println(language);
    }
}
