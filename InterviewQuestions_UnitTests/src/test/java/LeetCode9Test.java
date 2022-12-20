import org.example.LeetCode9;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode9Test {
    LeetCode9 lt9 = new LeetCode9();
    @Test
    void checkIfANegativeNumberIsNotPalindrome(){
        assertEquals(false,lt9.isPalindrome(-121));
    }

}
