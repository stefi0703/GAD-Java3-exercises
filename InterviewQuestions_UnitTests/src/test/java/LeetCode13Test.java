import org.example.LeetCode13.LeetCode13;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode13Test {
    LeetCode13 lt13= new LeetCode13();
    @Test
    void checkIfAddsOnes() {
        assertEquals(2, lt13.romanToInt("II"));
    }
    @Test
    void checkIfAddsDigits(){assertEquals(27,lt13.romanToInt("XXVII"));}
    @Test
    void checkIfReplaceDigits(){assertEquals(99,lt13.romanToInt("XCIX"));}
}
