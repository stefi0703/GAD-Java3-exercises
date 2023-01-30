import org.example.LeetCode242.LeetCode242;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode242Test {
    LeetCode242 lt242 = new LeetCode242();
    @Test
    void verifyIfAnagramsTrueCase(){
        assertEquals(true,lt242.isAnagram("listen","silent"));
    }
    @Test
    void verifyIfAnagramsFalseCase(){
        assertEquals(false,lt242.isAnagram("dictionar","indicatory"));
    }
}
