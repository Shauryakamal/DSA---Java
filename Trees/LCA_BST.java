package Trees;

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

public class LCA_BST {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        // Both nodes are in the left subtree
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }

        // Both nodes are in the right subtree
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        // Nodes are on different sides,
        // or one of them is the current root
        return root;
    }

    public static void main(String[] args) {

        LCA_BST obj = new LCA_BST();

        /*
         * 6
         * / \
         * 2 8
         * / \ / \
         * 0 4 7 9
         * / \
         * 3 5
         */

        TreeNode root = new TreeNode(6);

        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        TreeNode p = root.left; // 2
        TreeNode q = root.right; // 8

        TreeNode result = obj.lowestCommonAncestor(root, p, q);

        System.out.println("LCA: " + result.val);
    }
}