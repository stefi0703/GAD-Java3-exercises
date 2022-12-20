import org.example.LeetCode34;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeetCode34Test {
    LeetCode34 lt34 = new LeetCode34();
    @Test
    void check(){
        int nums[]={5,7,7,8,8,10};
        assertArrayEquals(new int[] {3,4},lt34.searchRange(nums,8));
    }
}
