package problem14;

class Solution {

    public String longestCommonPrefix(String[] strs) {
        if ((strs == null) || (strs.length == 0)) {
            return "";
        }
        String longestCommonPrefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            longestCommonPrefix = commonPrefix(longestCommonPrefix, strs[i]);
            if (longestCommonPrefix.isEmpty()) {
                break;
            }
        }
        return longestCommonPrefix;
    }

    private String commonPrefix(String str1, String str2) {
        StringBuilder commonPrefixBuilder = new StringBuilder();
        for (int i = 0; i < str1.length() && i < str2.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                commonPrefixBuilder.append(str1.charAt(i));
            } else {
                break;
            }
        }
        return commonPrefixBuilder.toString();
    }
}
