import org.example.LeetCode205.LeetCode205;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeetCode205Test {
    LeetCode205 lt205 = new LeetCode205();
    @Test
    void test1(){
        assertEquals(true,lt205.isIsomorphic("abab","cdcd"));
    }
    @Test
    void test2(){
        assertEquals(true,lt205.isIsomorphic("book","door"));
    }
    @Test
    void test3(){
        assertEquals(false,lt205.isIsomorphic("world","hello"));
    }
}
