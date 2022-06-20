package learnJavaClass;

public class StaticMethod {
    private int a=9;
    private static int b=10;
    public static void disp(){
        System.out.println(b);
    }
    public void show(){
        System.out.println(a+" "+ b);
    }

    public static void main(String[] args) {
        StaticMethod.disp();

        StaticMethod nonStatic = new StaticMethod();
        nonStatic.show();
    }
}
