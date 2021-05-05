package string.problems;

import java.util.Arrays;

public class Anagram {


    public static void getIsAnagram(String a, String b) {
        char[] charArrayOfA = a.toCharArray();
        char[] charArrayOfB = b.toCharArray();

        Arrays.sort(charArrayOfA);
        Arrays.sort(charArrayOfB);

        boolean isAnagram = Arrays.equals(charArrayOfA, charArrayOfB);

        if (isAnagram) {
            System.out.println(a + " and " + b + " are anagram");
        } else {
            System.out.println(a + " and " + b + " are not anagram");
        }
    }

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        getIsAnagram("CAT", "ACT");
        getIsAnagram("ARMY", "MARY");

    }
}
