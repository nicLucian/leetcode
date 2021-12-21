package problem290;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }
        return wordPattern(pattern, words) && wordPattern(words, pattern);
    }

    private boolean wordPattern(String pattern, String[] words) {
        Map<Character, String> cache = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            Character key = pattern.charAt(i);
            String cacheValue = cache.get(key);
            String expectedValue = words[i];
            if (cacheValue == null) {
                cache.put(key, expectedValue);
            } else {
                if (!cacheValue.equals(expectedValue)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean wordPattern(String[] words, String pattern) {
        Map<String, Character> cache = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            String key = words[i];
            Character cacheValue = cache.get(key);
            Character expectedValue = pattern.charAt(i);
            if (cacheValue == null) {
                cache.put(key, expectedValue);
            } else {
                if (!cacheValue.equals(expectedValue)) {
                    return false;
                }
            }
        }
        return true;
    }
}
