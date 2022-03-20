package learnArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LIstList {
    public static void main(String[] args) {
        int rowSize = 3;
        int colSize = 3;
        Scanner input = new Scanner(System.in);
        List<List<Integer>> arr = new ArrayList<>();
        for(int i =0; i<rowSize; i++){
            List<Integer> arrRow  = new ArrayList<>();
            for(int j =0; j<colSize; j++){
                int x = input.nextInt();
                arrRow.add(x);
            }
            arr.add(arrRow);
        }
        for(int i =0; i<rowSize; ++i){
            for(int j=0; j<colSize; ++j){
                System.out.print(arr.get(i).get(j)+ " ");
            }
            System.out.println();
        }
    }
}
//

