//Creating array
package numberConversion;

public class DecimalToBinary {
    public static int fib(int n){
        if(n <= 1){
            return n;
        }else {
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        final int ARRAY_LENGTH = 10;
        int [] a =new int[ARRAY_LENGTH];
        for(int i=0; i<a.length; i++){
            a[i]=fib(i);
        }
        System.out.println("Index\tValue");

        for(int i=0; i<a.length; i++){
            System.out.println(i + "\t\t" + a[i]);
        }
    }
}
//2D Array
package numberConversion;

public class DecimalToBinary {
    public static void main(String[] args) {
      int myArray[][] = new int [12][8];
      myArray[0][0] = 8;
      myArray[1][1] =5;
      myArray[4][2] = 23;

        System.out.println(myArray.length);
        System.out.println(myArray[0].length);
        System.out.println(myArray[11].length);
        System.out.println(myArray[4][2]);
        System.out.println(myArray[3][2]);
    }
}
//for loop
package numberConversion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int myArray[][] = new int[12][8];
        int numRows = myArray.length;
        int numColumn = myArray[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumn; j++) {
                myArray[i][j] = i * numColumn + j + 1;
            }
        }
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumn; j++) {
                System.out.print(myArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
//For-Each loop
package numberConversion;

public class DecimalToBinary {
    public static void main(String[] args) {
        int myArray[][] = new int[12][8];
        int numRows = myArray.length;
        int numColumn = myArray[0].length;

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumn; j++) {
                myArray[i][j] = i * numColumn + j + 1;
            }
        }
        for (int[] i: myArray ) {
            for (int j: i ){
                System.out.print(j+ "\t");
            }
            System.out.println();
        }
    }
}
//
