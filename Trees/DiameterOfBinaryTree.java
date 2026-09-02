package Trees;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
}
public class DiameterOfBinaryTree {
    private int diameter = 0;
    public int diameteriameterOfBinaryTree(TreeNode root){
        height(root);
        return diameter;
    }
    private int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        diameter = Math.max(diameter, leftHeight + rightHeight);

        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {

    DiameterOfBinaryTree obj = new DiameterOfBinaryTree();

    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);

    root.left.left = new TreeNode(4);
    root.left.right = new TreeNode(5);

    System.out.println(obj.diameteriameterOfBinaryTree(root));
}
}
