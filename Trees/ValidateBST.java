package Trees;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }

}

public class ValidateBST {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private boolean validate(TreeNode root, int min, int max) {
        if (root == null) {
            return true;
        }
        // current node range k andar hai ya nahi
        if (root.val <= min || root.val >= max) {
            return false;
        }
        return validate(root.left, min, root.val) &&
                validate(root.right, root.val, max);
    }

    public static void main(String[] args) {

        ValidateBST obj = new ValidateBST();

        /*
         * 5
         * / \
         * 3 7
         * / \ / \
         * 2 4 6 8
         */

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(8);

        System.out.println(obj.isValidBST(root));
    }
}
