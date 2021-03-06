/**In a binary tree, the root node is at depth 0, and children of each depth k node are at depth k+1.

Two nodes of a binary tree are cousins if they have the same depth, but have different parents.

We are given the root of a binary tree with unique values, and the values x and y of two different nodes in the tree.

Return true if and only if the nodes corresponding to the values x and y are cousins. */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode parent = null;
    int depth;
    
    boolean findElem(TreeNode root, int n, int level, TreeNode parent) {
        if(root == null){
            return false;
        }
        if(root.val == n) {
            this.parent = parent;
            this.depth = level;
            return true;
        }
        
        
        boolean res1 = this.findElem(root.left, n, level + 1, root);
        if(res1){
            return true;}
        
        boolean res2 = this.findElem(root.right, n, level + 1, root);
        return res2;
    }
    
    public boolean isCousins(TreeNode root, int x, int y) {
        boolean isPresent = this.findElem(root, x, 1, null);
        TreeNode parentX = this.parent;
        int depthX = this.depth;
        this.depth = 0;
        this.parent = null;
        isPresent = this.findElem(root, y, 1, null);
        TreeNode parentY = this.parent;
        int depthY = this.depth;
        
        
        if(depthX == depthY && parentX != parentY) {
            return true;
        }
        else {
            return false;
        }
    }
}