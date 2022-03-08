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
