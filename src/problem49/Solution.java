package problem49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            String key = key(str);
            List<String> list = map.get(key);
            if (list == null) {
                list = new ArrayList<>();
                map.put(key, list);
            }
            list.add(str);
        }
        return new ArrayList<>(map.values());
    }

    private String key(String str) {
        int[] nums = new int[26];
        char[] chars = str.toCharArray();
        for (char ch : chars) {
            nums[ch - '0']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                sb.append((char) ('0' + i) ).append(nums[i]);
            }
        }
        return sb.toString();
    }
}
