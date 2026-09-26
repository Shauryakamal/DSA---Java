package Trees;

import Arrays.Basics.reverse;

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

public class DeleteBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }
        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            }
            TreeNode successor = root.right;
            while (successor.left != null) {
                successor = successor.left;
            }
            root.val = successor.val;

            root.right = deleteNode(root.right, successor.val);
        }
        return root;
    }

    public static void main(String[] args) {

        DeleteBST obj = new DeleteBST();

        /*
         * 5
         * / \
         * 3 6
         * / \ \
         * 2 4 7
         */

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.right.right = new TreeNode(7);

        // Delete 3
        root = obj.deleteNode(root, 3);

        System.out.println("Root: " + root.val);
        System.out.println("Left: " + root.left.val);
        System.out.println("Right: " + root.right.val);
    }
}
