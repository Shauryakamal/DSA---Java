package Trees;

import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }
}

public class TwoBuildTree {
    private int postIndex;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        postIndex = postorder.length - 1;
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(postorder, 0, inorder.length - 1);
    }

    private TreeNode buildTreeHelper(int[] postorder, int left, int right) {
        // base case
        if (left > right) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postIndex--]);

        int rootIndex = map.get(root.val);
        root.right = buildTreeHelper(postorder, rootIndex + 1, right);
        root.left = buildTreeHelper(postorder, left, rootIndex - 1);

        return root;
    }

    public static void main(String[] args) {

        TwoBuildTree obj = new TwoBuildTree();

        int[] inorder = { 9, 3, 15, 20, 7 };
        int[] postorder = { 9, 15, 7, 20, 3 };

        TreeNode root = obj.buildTree(inorder, postorder);

        System.out.println("Root: " + root.val);
        System.out.println("Left: " + root.left.val);
        System.out.println("Right: " + root.right.val);
        System.out.println("Right Left: " + root.right.left.val);
        System.out.println("Right Right: " + root.right.right.val);
    }
}
