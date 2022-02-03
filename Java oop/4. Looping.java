package binary_search;

public class sqrt {
    public static void main(String[] args) {
        int day =1;
        String monthString;
        switch(day){
            case 1:
                monthString ="January";
                System.out.println("January");
                break;
            case 2:
                monthString =  "February";
                System.out.println("February");
                break;
        }
    }
}
//
package binary_search;

public class sqrt {
    public static void main(String[] args) {
        int noOfRows = 9;
        int rowCount = 1;
        for(int i = noOfRows; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=rowCount; j++){
                System.out.print(0+" ";
            }
            System.out.println();
            rowCount++;
        }
    }
}
//
package dataType;
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        boolean okay = true;
        do {
            System.out.println("Enter a line(quit to exit): ");
            String word = input.nextLine();
            System.out.println("You entered: " + word);
            if ("quit".equals(word)) {
                okay = false;
            }
        } while (okay);
    }
}
//
#
# #
# # #
# # # #
# # # # #
# # # # # #
# # # # # # #
# # # # # # # #
package dataType;
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        int noOfRows = 8;
        int rowCount = 1;
        for(int i = 1; i<=noOfRows; i++){
            for(int j=1; j<=i; j++) {
                System.out.print("#" + " ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
//
# # # # # # # #
# # # # # # #
# # # # # #
# # # # #
# # # #
# # #
# #
#
package dataType;
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        int noOfRows = 8;
        int rowCount = 1;
        for(int i = noOfRows; i>0; i--){
            for(int j=1; j<=i; j++) {
                System.out.print("#" + " ");
            }
            System.out.println();
            rowCount++;
        }
    }
}
//
# # # # # # # #
  # # # # # # #
    # # # # # #
      # # # # #
        # # # #
          # # #
            # #
              #
              package dataType;
              import java.util.Scanner;
              public class doWhile {
                  public static void main(String[] args) {
                      int noOfRows = 8;
                      int rowCount = 0;
                      for(int i = noOfRows; i>0; i--){
                          for(int j=noOfRows; j>i; j--) {
                              System.out.print("  ");
                          }
                          for(int j=1; j<=i; j++) {
                              System.out.print("#" + " ");
                          }

                          System.out.println();
                      }
                  }
              }
  //
       #
      # #
     # # #
    # # # #
   # # # # #
  # # # # # #
 # # # # # # #
# # # # # # # #
package dataType;
import java.util.Scanner;
public class doWhile {
    public static void main(String[] args) {
        int noOfRows = 8;
        int rowCount = 0;
        for(int i = 1; i<=noOfRows; i++){
            for(int j=i; j<noOfRows; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++) {
                System.out.print("#" + " ");
            }
            System.out.println();
        }
    }
}
//
