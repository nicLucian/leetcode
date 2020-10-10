package problem239;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        MonotonicDeque deque = new MonotonicDeque();
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            if (i < k - 1) {
                deque.push(nums[i]);
            } else {
                deque.push(nums[i]);
                result[i - k + 1] = deque.max();
                deque.pop(nums[i - k + 1]);
            }
        }
        return result;
    }

    private static class MonotonicDeque {
        private Deque<Integer> mDeque = new ArrayDeque<>();

        public void push(int value) {
            while (!mDeque.isEmpty() && mDeque.peekLast() < value) {
                mDeque.pollLast();
            }
            mDeque.addLast(value);
        }

        public int max() {
            return mDeque.peekFirst();
        }

        public void pop(int n) {
            if (!mDeque.isEmpty() && mDeque.peekFirst() == n) {
                mDeque.pollFirst();
            }
        }
    }
}
