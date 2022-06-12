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

