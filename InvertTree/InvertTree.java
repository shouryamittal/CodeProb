
// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
 
public class InvertTree {
    Queue<TreeNode> queue = new LinkedList<>();
    public TreeNode invertTree(TreeNode root) {
        if(root == null) {
            return null;
        }
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode tempNode = queue.poll();
            if(tempNode != null && (tempNode.left != null || tempNode.right != null)) {
                TreeNode temp = tempNode.left;
                tempNode.left = tempNode.right;
                tempNode.right = temp;
                this.queue.add(tempNode.left);
                this.queue.add(tempNode.right);
            }
        }
       return root;
    }
}