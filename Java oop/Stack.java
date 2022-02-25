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
//
package dataStructure.learnStack;

import java.util.Stack;

public class StackLeetCode {
    public static void main(String[] args) {
        Stack<Character> word = new Stack<>();

        word.add('T');
        word.add('S');
        word.add('F');

        System.out.println(word.pop());
        System.out.println(word.peek());
        System.out.println(word.push('H'));

        System.out.println(word);


    }
}
//
package dataStructure.learnStack;

import java.util.Stack;

public class StackLeetCode {
    public static void main(String[] args) {
        Stack<Integer> word = new Stack<>();

        word.add(1);
        word.add(2);
        word.add(3);

        System.out.println(word.pop());
        System.out.println(word.peek());
        System.out.println(word.push(4));

        System.out.println(word);


    }
}
//
package dataStructure.learnStack;

import java.util.Stack;

public class StackLeetCode {
    public static void main(String[] args) {
        Stack<Integer> word = new Stack<>();

        word.add(1);
        word.add(2);
        word.add(3);

        System.out.println(word.pop());
        System.out.println(word.peek());
        System.out.println(word.push(4));

        System.out.println(word.empty());

        word.set(2,10);
        System.out.println(word.get(2));
        System.out.println(word.get(0));

    }
}
//
