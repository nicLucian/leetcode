package problem71;

import java.util.LinkedList;

public class Solution {
    public String simplifyPath(String path) {
        if (isEmpty(path)) {
            return null;
        }
        LinkedList<String> stack = new LinkedList<>();
        String reg = "[/]+";
        String[] dirs = path.split(reg);
        for (String dir : dirs) {
            if (!isEmpty(dir)) {
                switch (dir) {
                    case ".":
                        continue;
                    case "..":
                        stack.poll();
                        break;
                    default:
                        stack.push(dir);
                        break;
                }
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = stack.size() - 1; i >=0 ; i--) {
            sb.append("/").append(stack.get(i));
        }
        return sb.toString();
    }

    private boolean isEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String path = "/home//foo/";
        System.out.println(solution.simplifyPath(path));
    }
}
