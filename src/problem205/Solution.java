package problem205;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int length = s.length();
        Map<Character, Character> sCache = new HashMap<>();
        Map<Character, Character> tCache = new HashMap<>();
        for (int i = 0; i < length; i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if (sCache.containsKey(sChar) && sCache.get(sChar) != tChar) {
                return false;
            }

            if (tCache.containsKey(tChar) && tCache.get(tChar) != sChar) {
                return false;
            }
            sCache.put(sChar, tChar);
            tCache.put(tChar, sChar);
        }
        return true;
    }


}
