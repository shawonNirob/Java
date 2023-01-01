package classExplain;

public class OuterClass {
    int number = 10;
    public void show(){
        System.out.println("This is outerClass and "+"number = "+number);
    }
    public static class InnerClass{
        int number = 20;
        public void disp(){
            System.out.println("This is outerClass and "+"number = "+number);
        }
    }
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.show();

        //OuterClass.InnerClass inner = new OuterClass.InnerClass();
        InnerClass inner = new InnerClass();
        inner.disp();
    }
}

