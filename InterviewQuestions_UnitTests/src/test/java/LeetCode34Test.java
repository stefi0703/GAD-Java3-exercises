import org.example.LeetCode34.Leetcode34;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode34Test {
    Leetcode34 lt34 = new Leetcode34();

    @Test
    void checkSearchRanage() {
        int[] nums = {5,7,7,8,8,10};
        assertArrayEquals(new int[] {3,4}, lt34.searchRange(nums, 8));
    }
}
