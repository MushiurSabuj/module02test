package problems;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //String str1 = "listen";
        //String str2 = "silent";
        //String str1 ="cat";
        //String str2 ="act";
        String str1 ="army";
        String str2 ="mary";

        boolean isAnagram = isAnagram(str1, str2);
        System.out.println(isAnagram);
    }


    //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
    //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".


    private static boolean isAnagram(String str1, String str2) {
        char[] inputOne = str1.toLowerCase().replace(" ", "").toCharArray();
        char[] inputTwo = str2.toLowerCase().replace(" ", "").toCharArray();
        Arrays.sort(inputOne);
        Arrays.sort(inputTwo);
        return Arrays.equals(inputOne, inputTwo);

        // find whether this word is anagram or not
        // these two words are anagrams
    }
}

