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

public class InvertTree {
    public TreeNode inveTreeNode(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        inveTreeNode(root.left);
        inveTreeNode(root.right);
        return root;
    }

    public static void main(String[] args) {
        InvertTree obj = new InvertTree();
        TreeNode root = new TreeNode(4);

        root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        obj.inveTreeNode(root);

        // Inverted tree print karne ke liye
        printInOrder(root);
    }

    public static void printInOrder(TreeNode root) {

        if (root == null) {
            return;
        }

        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }
}
