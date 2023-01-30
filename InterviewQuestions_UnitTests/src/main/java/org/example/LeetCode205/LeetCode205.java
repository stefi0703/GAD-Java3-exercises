package org.example.LeetCode205;

import java.util.HashMap;
import java.util.Map;



public class LeetCode205 {
    public static boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;

        Map<Character, Character> countLetters = new HashMap<>();
        char character = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (countLetters.containsKey(s.charAt(i))) {
                character = countLetters.get(s.charAt(i));
                if (character != t.charAt(i)) return false;
            } else if (!countLetters.containsValue(t.charAt(i))) {
                countLetters.put(s.charAt(i), t.charAt(i));
            }
            else return false;

        }
        return true;
    }
//    public static void main(String[] args) {
//
//        String str1 = "paper";
//        String str2 = "title";
//        System.out.println(isIsomorphic(str1,str2));
//
//    }
}
