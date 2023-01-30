import org.example.LeetCode704.LeetCode704;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode704Test {
    LeetCode704 lt704 = new LeetCode704();
    @Test
    void arrayWithBothPositiveAndNegativeNo(){
        int[] nums = {-10,-5,0,3,7};
        assertEquals(1,lt704.search(nums,-5));
    }
    @Test
    void arrayWithRepeatedNo(){
        int[] nums = {1,1,2,2,3,4};
        assertEquals(2,lt704.search(nums,2));
    }
}
