package org.example;

public class LeetCode9 {
        public boolean isPalindrome(int x) {
          if (x < 0) return false;
           if (x % 10 == 0) return false;
            if (x == 0)return true;
            return x == reverseNumber(x);
        }
        public int reverseNumber(int x){
            int xReversed = 0;
            while( x!= 0 )
            {
                int remainder = x % 10;
                xReversed = xReversed * 10 +remainder;
                x = x / 10;
            }
            return xReversed;
        }
    }

