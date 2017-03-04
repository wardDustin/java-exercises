package org.launchcode.java.demos.java4python.ClassThreeTwo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by dward on 3/1/17.
 */
public class FunWithArrayListsAndStrings {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", "There", "My", "Fine", "Fried", "Friend");

        for (String single : stringList)
            if (single.length() == 5)
                System.out.println(single);
    }
}
