package org.example.LeetCode344;

public class LeetCode344 {
    public char[] reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while(i<j){
            char tmp = s[i];
            s[i] = s[j];
            s[j] = tmp;
            i++;
            j--;
        }
    return s;
    }
}
