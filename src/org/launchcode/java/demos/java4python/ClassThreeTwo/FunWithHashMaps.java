package org.launchcode.java.demos.java4python.ClassThreeTwo;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dward on 3/1/17.
 */
public class FunWithHashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        Scanner name = new Scanner(System.in);
        Scanner id = new Scanner(System.in);
        Integer studentId;
        String studentName;

        do {
            System.out.println("Hey Teach! Need your student's name: ");
            studentName = name.nextLine();

            if (!studentName.equals("")){
                System.out.println("Thank you! Now, I need their ID: ");
                studentId = id.nextInt();

                hashMap.put(studentName, studentId);
            }

        } while (!studentName.equals(""));

        for (Map.Entry<String, Integer> student : hashMap.entrySet()){
            System.out.println(String.format("The student: %s has the ID: %d", student.getKey(), student.getValue()));
        }


    }
}
