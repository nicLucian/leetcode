package problem5434;

class Solution {
    public int longestSubarray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int head = 0;
        int tail = 0;
        int newHead = 0;
        int maxLength = 0;
        int currentLength = 0;
        boolean needCount = false;
        while (tail < nums.length) {
            if (needCount) {
                if (nums[tail] == 0 /*|| tail == nums.length - 1*/) {
                    currentLength = tail - head;
                    needCount = false;
                    head = newHead;
                    tail = head;
                    if (currentLength > maxLength) {
                        maxLength = currentLength;
                    }
                }
            } else if (nums[tail] == 0) {
                needCount = true;
                newHead = tail + 1;
            }
            tail++;
        }
        return maxLength - 1;
    }
}
