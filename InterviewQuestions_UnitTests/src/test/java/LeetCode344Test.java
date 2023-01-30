import org.example.LeetCode344.LeetCode344;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode344Test {
    LeetCode344 lt344 = new LeetCode344();
    @Test
    void test1(){
        char[] test = new char[]{'H', 'e', 'l', 'l', 'o', '!', '2', '0', '2', '3'};
        assertArrayEquals(new char[]{'3', '2', '0', '2', '!', 'o', 'l', 'l', 'e', 'H'},lt344.reverseString(test));
    }
    @Test
    void test2(){
        char[] test = new char[]{'r', 'e', 'v', 'e', 'r', 's', 'e', '0', '9', '^'};
        assertArrayEquals(new char[]{'^', '9', '0', 'e', 's', 'r', 'e', 'v', 'e', 'r'},lt344.reverseString(test));
    }
}
