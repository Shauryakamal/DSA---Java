package Trees;

import java.util.HashMap;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

public class BuildTree {
    private int preIndex = 0;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return buildTreeHelper(preorder, 0, inorder.length - 1);
    }

    public TreeNode buildTreeHelper(int[] preorder, int left, int right) {
        if (left > right) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIndex++]);
        int rootIndex = map.get(root.val);
        root.left = buildTreeHelper(preorder, left, rootIndex - 1);
        root.right = buildTreeHelper(preorder, rootIndex + 1, right);
        return root;
    }

    public static void main(String[] args) {

        BuildTree obj = new BuildTree();

        int[] preorder = { 3, 9, 20, 15, 7 };
        int[] inorder = { 9, 3, 15, 20, 7 };

        TreeNode root = obj.buildTree(preorder, inorder);

        System.out.println("Root: " + root.val);
        System.out.println("Left: " + root.left.val);
        System.out.println("Right: " + root.right.val);
        System.out.println("Right Left: " + root.right.left.val);
        System.out.println("Right Right: " + root.right.right.val);
    }

}
