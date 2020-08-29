package problem_solving;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String str1 = "is ARMY";
        String str2 = "is MARY";
        //String str1 = "is ARMY";
       // String str2 = "is MARY";

        System.out.println("String 1: " + str1);
        System.out.println("string2: " + str2);

        str1 = str1.replace(" ", "");
        str2 = str2.replace(" ", "");

        char char1[] = str1.toLowerCase().toCharArray();
        char char2[] = str2.toLowerCase().toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        boolean result = Arrays.equals(char1, char2);



        if (result == true) {
            System.out.println(" String 1 and String 2 are anagram");
        } else {
            System.out.println(" String 1 and String 2 are not anagram");
        }
    }
}


/*    private static boolean isAnagram(String a, String b) {

        int[] counts = new int[26];  // 0,0,0,0,0
        char[] aArr = a.toLowerCase().toCharArray();
        char[] bArr = b.toLowerCase().toCharArray();
        for (int i = 0; i < aArr.length; i++)
        {
            counts[aArr[i] - 97]++;  // Increment the count of the character at respective position
            counts[bArr[i] - 97]--;  // Decrement the count of the character at respective position
        }
        // If the strings are anagrams, then counts array will be full of zeros not otherwise

        for (int i = 0; i < 26; i++)
        {
            if (counts[i] != 0)
            {
                return false;
            }
        }
        return true;
    }*/

