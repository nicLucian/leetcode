package problem412;

class Solution {
    public String addStrings(String num1, String num2) {
        int length1 = num1.length();
        int length2 = num2.length();
        int addition = 0;
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < length1 || i < length2; i++) {
            int index1 = length1 - i -1;
            int source1 = index1 < 0 ? 0 : (num1.charAt(index1) - '0');

            int index2 = length2 - i - 1;
            int source2 = index2 < 0 ? 0 : (num2.charAt(index2) - '0');

            int sum = source1 + source2 + addition;
            int num = sum % 10;
            addition = sum / 10;
            resultBuilder.append(num);
        }
        if (addition > 0) {
            resultBuilder.append(addition);
        }
        return resultBuilder.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String num1 = "9";
        String num2 = "99";
        System.out.println(solution.addStrings(num1, num2));
    }
}
