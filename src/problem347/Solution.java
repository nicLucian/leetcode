package problem347;

import java.util.*;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Pair> pairs = new HashMap<>();
        for (int num : nums) {
            Pair pair = pairs.get(num);
            if (pair == null) {
                pair = new Pair(num, 1);
                pairs.put(num, pair);
            } else {
                pair.frequency++;
            }
        }
        Collection<Pair> pairSet = pairs.values();
        PriorityQueue<Pair> queue = new PriorityQueue<>(pairSet);
        for (int i = 0; i < k; i++) {
            Pair pair = queue.poll();
            result[i] = pair.num;
        }
        return result;

    }

    private static class Pair implements Comparable<Pair>{
        Pair(int num, int frequency) {
            this.num = num;
            this.frequency = frequency;
        }

        int num;
        int frequency;

        @Override
        public int compareTo(Pair o) {
            return o.frequency - frequency;
        }
    }
}
