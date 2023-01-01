package classExplain;

public class OuterClass {
    int number = 10;
    public void show(){
        System.out.println("This is outerClass and "+"number = "+number);
    }
    public class InnerClass{
        int number = 20;
        public void disp(){
            System.out.println("This is outerClass and "+"number = "+number);
        }
    }
    public static void main(String[] args) {
          OuterClass outer = new OuterClass();
          outer.show();

          //Need to create a inner instance of outer class
          OuterClass.InnerClass inner = outer.new InnerClass();
          inner.disp();
      }
}
