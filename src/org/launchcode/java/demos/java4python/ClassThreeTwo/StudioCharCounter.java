package org.launchcode.java.demos.java4python.ClassThreeTwo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by dward on 3/2/17.
 */
public class StudioCharCounter {
    public static void main(String[] args) {
        String lorem = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. Donec nec velit non ligula efficitur luctus.";
        HashMap<Character, Integer> hashMap = new HashMap<Character, Integer>();

        char[] charLorem = lorem.toCharArray();

        for (Character c : charLorem){
            int counter = 0;

            if (hashMap.containsKey(c)) {
                hashMap.put(c, hashMap.get(c) + 1);
            }
            else {
                hashMap.put(c, ++counter);
            }

//            hashMap.merge(c, 1, Integer::sum);
        }

        hashMap = bonusFromInput(hashMap);
        hashMap = bonusFromFile(lorem, hashMap);

        for (Map.Entry<Character, Integer> ch : hashMap.entrySet())
            System.out.println(String.format("%c: %d", ch.getKey(), ch.getValue()));
    }

    public static HashMap bonusFromInput(HashMap<Character, Integer> hashMap){
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, friend! Please provide an input string and I shall count the characters!");
        String input = scan.nextLine();

        char[] charLorem = input.toCharArray();

        for (Character c : charLorem) {
            Character newC = Character.toLowerCase(c);
            c.isAlphabetic(c);
            if (Character.isAlphabetic(newC)) {
                hashMap.merge(newC, 1, Integer::sum);
            }
        }

        return hashMap;
    }

    public static HashMap bonusFromFile(String lorem, HashMap<Character, Integer> hashMap){
        Path path = Paths.get("test.txt");
        try(BufferedWriter writer = Files.newBufferedWriter(path)){
            writer.write(lorem);
        } catch (IOException e){
            System.out.println("Sorry, our writer failed!");
        }

        try{
            List<String> lines = Files.readAllLines(Paths.get("test.txt"));
            String complete = "";
            for (String line: lines){
                complete += line;
            }

            char[] charSet = complete.toCharArray();

            for (Character ch : charSet){
                Character newC = Character.toLowerCase(ch);
                if (Character.isAlphabetic(newC)) {
                    hashMap.merge(newC, 1, Integer::sum);
                }
            }

        } catch(IOException e){
            System.out.println("Sorry, the reader failed!");
        }

        return hashMap;
    }
}
