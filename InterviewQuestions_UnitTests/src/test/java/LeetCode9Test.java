import org.example.LeetCode9.Leetcode9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode9Test {
    Leetcode9 lt9 = new Leetcode9();

    @Test
    void checkIfANegativeNumberIsNotPalindrome() {
        assertEquals(false, lt9.isPalindrome(-121));
    }
    @Test
    void checkIfZeroIsPalindrome(){assertEquals(true,lt9.isPalindrome(0));}
    @Test
    void checkPositiveNo(){assertEquals(false,lt9.isPalindrome(321));}
    @Test
    void checkPositiveNoTrue(){assertEquals(true,lt9.isPalindrome(121));}

}
