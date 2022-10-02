
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

//All Subsets
4.
package recursion;

import java.util.LinkedList;
import java.util.List;

public class PrintName{
    public void helper(int index, int[] arr, LinkedList<Integer> list, int n){
        if(index >= n){
            System.out.println(list);
            return;
        }

        list.add(arr[index]);
        helper(index+1, arr, list, n);
        list.removeLast();
        helper(index+1, arr, list, n);
    }

    public static void main(String[] args){
        PrintName cal = new PrintName();
        LinkedList<Integer> list = new LinkedList<>();
        int[] arr = {2,2,2,2,3,4,5};
        int n = arr.length;
        cal.helper(0, arr, list, n);
    }
}



//K sum
5.
package recursion;

import java.util.LinkedList;
import java.util.List;

public class PrintName{
    public boolean helper(int index, int[] arr, LinkedList<Integer> list, int n, int sum, int k){
        if(index >= n){
            if(sum == k){
                System.out.println(sum);
                return true;
            }else{
                return false;
            }
        }

        list.add(arr[index]);
        sum += arr[index];
        if(helper(index+1, arr, list, n, sum, k)) return true;
        list.removeLast();
        sum -= arr[index];
        if(helper(index+1, arr, list, n, sum, k)) return true;

        return false;
    }

    public static void main(String[] args){
        PrintName cal = new PrintName();
        LinkedList<Integer> list = new LinkedList<>();
        int[] arr = {2,1,3};
        int n = arr.length;
        if(cal.helper(0, arr, list, n, 0, 3)){
            System.out.println(true);
        };
    }
}


