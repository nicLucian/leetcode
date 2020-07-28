package problem146;

import java.util.HashMap;
import java.util.Map;

class LRUCache {
    private static class Node {
        public Node(int key, int value) {
            this.value = value;
            this.key = key;
        }

        Node pre;
        Node next;
        int key;
        int value;
    }

    private final int mCapacity;
    private final Node mHead;
    private final Node mTail;
    private final Map<Integer, Node> mMap = new HashMap<>();

    private int mSize;

    public LRUCache(int capacity) {
        mCapacity = capacity;
        mSize = 0;
        mHead = new Node(0, 0);
        mTail = new Node(0, 0);
        mHead.next = mTail;
        mTail.pre = mHead;
    }

    public int get(int key) {
        //1.get from hashmap
        Node target = mMap.get(key);
        if (target == null) {
            return -1;
        }
        //2.move to first.
        deleteNode(target);
        addFirst(target);
        return target.value;
    }

    public void put(int key, int value) {
        Node target = mMap.get(key);
        if (target != null) {
            target.value = value;
            deleteNode(target);
            addFirst(target);
            return;
        }
        Node last = mTail.pre;
        //1.if current size greater than capacity delete last
        if (mSize >= mCapacity) {
            deleteNode(last);
            mMap.remove(last.key);
            mSize --;
        }
        //2.add to last.
        Node newNode = new Node(key, value);
        addFirst(newNode);
        mMap.put(key, newNode);
        mSize++;
    }

    private void deleteNode(Node node) {
        Node pre = node.pre;
        Node next = node.next;
        pre.next = next;
        next.pre = pre;
    }

    private void addFirst(Node node) {
        Node first = mHead.next;
        mHead.next = node;
        node.pre = mHead;
        node.next = first;
        first.pre = node;
    }
}
