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

public class FlattenBinary {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode right = root.right;
        flatten(root.left);
        root.right = root.left;

        root.left = null;
        TreeNode current = root.right;

        if (current != null) {
            while (current.right != null) {
                current = current.right;
            }
            current.right = right;
        } else {
            root.right = right;
        }
        flatten(right);
    }

    public static void main(String[] args) {

        FlattenBinary obj = new FlattenBinary();

        /*
         * 1
         * / \
         * 2 5
         * / \ \
         * 3 4 6
         */

        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(5);

        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(6);

        obj.flatten(root);

        // Flattened tree print
        TreeNode current = root;

        while (current != null) {

            System.out.print(current.val + " ");

            // Left should always be null
            if (current.left != null) {
                System.out.println("\nError: Left is not null");
                break;
            }

            current = current.right;
        }
    }
}
