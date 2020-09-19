package problem451;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Node> countMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            Node node = countMap.get(ch);
            if (node == null) {
                node = new Node(ch);
                countMap.put(ch, node);
            }
            node.count++;

        }

        PriorityQueue<Node> queue = new PriorityQueue<>(countMap.values());
        StringBuilder stringBuilder = new StringBuilder();
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            for (int i = 0; i < node.count; i++) {
                stringBuilder.append(node.value);
            }
        }
        return stringBuilder.toString();
    }

    static class Node implements Comparable<Node> {
        char value;
        int count;

        Node(char value) {
            this.value = value;
        }

        @Override
        public int compareTo(Node o) {
            return o.count - this.count;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", count=" + count +
                    '}';
        }
    }
}
