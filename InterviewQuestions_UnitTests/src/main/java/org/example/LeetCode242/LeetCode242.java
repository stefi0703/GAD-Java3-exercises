package org.example.LeetCode242;

import java.util.HashMap;
import java.util.Map;

public class LeetCode242 {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i<= s.length()-1;i++)
        {
            if(map.containsKey(s.charAt(i))==false){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            }
        }
        for(int i = 0; i<= t.length()-1;i++)
        {
            if(map.containsKey(t.charAt(i))){
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
                if(map.get(t.charAt(i)) ==0){
                    map.remove(t.charAt(i));
                }
            }else{
                return false;
            }
        }
        return map.isEmpty();
    }
}
