
// Recursion
1.
package recursion;

public class PrintName {
    public void helper(String name, int val){
        if(val == 0) return;
        System.out.println(name);

        helper(name, val-1);
    }

    public static void main(String[] args) {
        PrintName cal = new PrintName();
        cal.helper("Nirob", 5);
    }
}


2.
package recursion;

public class PrintName {
    public void helper(int val){
        if(val == 0) return;

        System.out.println(val);
        helper(val-1);
    }

    public static void main(String[] args) {
        PrintName cal = new PrintName();
        cal.helper(5);
    }
}


//BackTracking
3.
package recursion;

public class PrintName {
    public void helper(int val){
        if(val == 0) return;

        helper(val-1);
        System.out.println(val);
    }

    public static void main(String[] args) {
        PrintName cal = new PrintName();
        cal.helper(5);
    }
}

