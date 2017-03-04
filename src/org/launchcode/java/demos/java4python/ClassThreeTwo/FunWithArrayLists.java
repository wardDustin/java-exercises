package org.launchcode.java.demos.java4python.ClassThreeTwo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dward on 2/28/17.
 */
public class FunWithArrayLists {
    public static void main (String[] Args){
        List<Integer> intList = Arrays.asList(2, 43, 26, 838, 92, 17, 23, 63, 991, 10100);
        int sum = 0;

        for (int singleInt : intList){
            if (singleInt % 2 == 0){
                sum += singleInt;
            }
        }

        System.out.println("The sum of all even integers in the list equals: " + sum);
    }

}
