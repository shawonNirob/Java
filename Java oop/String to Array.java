package javaExpression;

import java.util.Arrays;
import java.util.regex.Pattern;

public class split {
    public static void main(String[] args) {
        String str = "Roll the dice";
        System.out.println(str);

        //Use split function
        String [] arr = str.split(" ");
        System.out.println(arr);
        for(String i : arr)
            System.out.println(i);

        System.out.println(Arrays.toString(arr));
        //Use java pattern
        Pattern pattern = Pattern.compile(" ");
        arr = pattern.split(str);

        System.out.println(Arrays.toString(arr));

    }
}

//

package javaExpression;

import java.util.Arrays;
import java.util.regex.Pattern;

public class split {
    public static void main(String[] args) {
        String str = "Roll the dice";
        System.out.println(str);

        //Use split function
        String [] arr = str.split(" ");
        System.out.println(arr);
        for(String i : arr)
            System.out.println(i);

        //example 2
        String value = "*,#,$,@,^,&,(,),8.7.8";
        String [] arr2 = value.split(",");
        for(String i : arr2)
            System.out.println(i);

        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(arr));

        //Use java pattern
        Pattern pattern = Pattern.compile(" ");
        arr = pattern.split(str);

        System.out.println(Arrays.toString(arr));

    }
}

//
