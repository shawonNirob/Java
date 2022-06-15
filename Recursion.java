package recursion;

public class AddArray {
    public int add(int[] arr, int n){
        if(n==0){
            return arr[n];
        }
        return arr[n] + add(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6};
        int n = arr.length-1;

        AddArray call = new AddArray();
        System.out.println(call.add(arr, n));
    }
}

//
package recursion;

public class AddArray {
    public int add(int[] arr, int n){
        if(n== arr.length-1){
            return arr[n];
        }
        return arr[n] + add(arr, n+1);
    }
    public void printNumber(int n){
        System.out.print(n+" ");
        if(n==10){
            return;
        }
        printNumber(n+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6};
        int n = arr.length-1;

        AddArray call = new AddArray();
        System.out.println(call.add(arr, 0));

        call.printNumber(0);
    }
}

