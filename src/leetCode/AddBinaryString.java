package leetCode;
import java.nio.charset.CharsetEncoder;
import java.util.Scanner;

//import static jdk.vm.ci.meta.JavaKind.Char;


public class AddBinaryString {
            public String addBinary(String A, String B) {
            int length;
            char [] array1 = new char [A.length()];
            char[] array2 = new char [B.length()];
            length = Math.max(A.length(), B.length());
            char[] array3 = new char[length];
            for(int i=0; i<A.length(); i++){
                array1[i] = A.charAt(i);
            }
            for(int i=0; i<B.length(); i++){
                array2[i] = B.charAt(i);
            }
            int c=0;
            int i=A.length(), j=B.length();
            while( i> 0 && j>0){
                int sum = array1[i-1] + array2[j-1] +c ;
                array3[length-1] =(char) (sum%2);
                c= sum/2;
                i--;
                j--;
                length--;
            }
            if(i!=0){
                array3[i] = array1[i-1];
            }
            if (j!=0){
                array3[j-1] = array2[j-1];
            }
            String ans = String.valueOf(array3);

            return ans;

        }
    public static void main(String[] args) {
        /*canner input = new Scanner(System.in);
        System.out.println("Enter a Binary number ");
        String A = input.nextLine();
        System.out.println("Enter another Binary number ");
        String B = input.nextLine();*/

        AddBinaryString Cal = new AddBinaryString();
        System.out.println("Sum of two Binary = " +Cal.addBinary("101","111"));

    }

}
