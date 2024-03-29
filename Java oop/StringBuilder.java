package learnJavaClass;
import java.lang.StringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder test = new StringBuilder("test case: ");
        test.append("case no 01");
        test.replace(0,4, "Test");
        test.delete(19,21);

        System.out.println(test);
    }
}
//StringBuilder have a reverse method;
package learnJavaClass;
import java.lang.StringBuilder;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder test = new StringBuilder("test case: ");
        test.append("case no 01");
        test.replace(0,4, "Test");
        System.out.println(test);

        test.delete(19,21);
        System.out.println(test);

        test.reverse();
        System.out.println(test);
        
        System.out.println(test.substring(1,test.length()-1));
    }
}

//other uses
public class StBul {
    public static void main(String[] args) {
        HashSet<String> set =new HashSet<>();
        StringBuilder shape =  new StringBuilder();
        shape.append(0);
        shape.append(2);
        set.add(shape.toString());

        shape.delete(0, shape.length());
        shape.append(5);
        shape.append(6);
        set.add(shape.toString());

        System.out.println(set);

    }
}
