package src_util;

public class TreeUtil {
    private TreeUtil() {

    }

    public static TreeNode buildTree(Integer[] values) {
        TreeNode[] nodes = new TreeNode[values.length];
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null) {
                TreeNode node = new TreeNode(values[i]);
                nodes[i] = node;
            } else {
                nodes[i] = null;
            }
        }

        for (int i = 1; i < values.length; i++) {
            TreeNode currentNode = nodes[i];
            int parentIndex = (i - 1) / 2;
            TreeNode parentNode = nodes[parentIndex];
            boolean isLeft = (i % 2 == 1);
            if (isLeft) {
                parentNode.left = currentNode;
            } else {
                parentNode.right = currentNode;
            }
        }
        return nodes[0];
    }

    private static void inorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            inorder(root.left);
            inorder(root.right);
        }

    }

    private static void preorder(TreeNode root) {
        if (root != null) {
            preorder(root.left);
            System.out.print(root.val + " ");
            preorder(root.right);
        }
    }

    private static void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }
}
