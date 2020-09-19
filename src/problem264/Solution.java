package problem264;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public int nthUglyNumber(int n) {
        List<Integer> array = new ArrayList<>();
        array.add(1);
        int point2 = 0;
        int point3 = 0;
        int point5 = 0;
        for (int i = 1; i < n; i++) {
            int num2 = array.get(point2) * 2;
            int num3 = array.get(point3) * 3;
            int num5 = array.get(point5) * 5;
            int ugly = min(num2, num3, num5);
            array.add(ugly);
            if (num2 == ugly) {
                point2++;
            }
            if (num3 == ugly) {
                point3++;
            }
            if (num5 == ugly) {
                point5++;
            }
        }
        return array.get(n - 1);
    }

    private int min(int num2, int num3, int num5) {
        int min = Math.min(num2, num3);
        min = Math.min(min, num5);
        return min;
    }

}
