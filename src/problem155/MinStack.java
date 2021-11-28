package problem155;

import java.util.Deque;
import java.util.LinkedList;

public class MinStack {
    private Deque<Integer> mDeque;
    private int mMin = Integer.MAX_VALUE;

    /** initialize your data structure here. */
    public MinStack() {
        mDeque = new LinkedList<>();
    }

    public void push(int val) {
        mDeque.push(val);
        if (val < mMin) {
            mMin = val;
        }
    }

    public void pop() {
        int top = mDeque.pop();
        if (top == mMin) {
            mMin = Integer.MAX_VALUE;
            for (int val : mDeque) {
                if (val < mMin) {
                    mMin = val;
                }
            }
        }
    }

    public int top() {
        return mDeque.peek();
    }

    public int getMin() {
        return mMin;
    }
}
