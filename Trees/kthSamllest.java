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
public class kthSamllest {
    private int count = 0;
    private int answer = 0;
    public int kthSmallestvalue(TreeNode root, int k){
        inorder(root,k);
        return answer;
    }
    public void inorder(TreeNode root,int k){
        if(root == null){
            return;
        }
        inorder(root.left, k);
        count++;
        if(count == k){
            answer = root.val;
            return ;
        }
        inorder(root.right, k);
    }
    public static void main(String[] args) {

        kthSamllest obj = new kthSamllest();

        /*
                5
               / \
              3   6
             / \
            2   4
           /
          1
        */

        TreeNode root = new TreeNode(5);

        root.left = new TreeNode(3);
        root.right = new TreeNode(6);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);

        root.left.left.left = new TreeNode(1);

        int k = 3;

        System.out.println("Kth Smallest: "
                + obj.kthSmallestvalue(root, k));
    }
}
