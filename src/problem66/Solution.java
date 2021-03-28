package problem66;


import java.util.Arrays;

/**
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 * <p>
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    public int[] plusOne(int[] digits) {
        int carrier = 1;
        int sum = 0;
        for (int i = digits.length - 1; i >= 0; i--) {
            sum = digits[i] + carrier;
            carrier = sum / 10;
            digits[i] = sum % 10;
        }
        if (carrier == 0) {
            return digits;
        } else {
            int[] result = new int[digits.length + 1];
            System.arraycopy(digits, 0, result, 1, digits.length);
            result[0] = carrier;
            return result;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] digits = {1,2,3,4};
        System.out.println(Arrays.toString(solution.plusOne(digits)));

        int[] digits1 = {1,2,3,9};
        System.out.println(Arrays.toString(solution.plusOne(digits1)));

        int[] digits2 = {9};
        System.out.println(Arrays.toString(solution.plusOne(digits2)));
    }
}
