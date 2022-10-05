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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
       
         if (depth == 1) {
            TreeNode newroot = new TreeNode(val);
            newroot.left = root;
            return newroot;
        }
        insert(root , val , depth ,1);
        return root;
        
    }
    public void insert(TreeNode node, int v, int d , int currentDepth){
        if(node==null) return;
        if(currentDepth==d-1){
            TreeNode temp=node.left;
            node.left=new TreeNode(v);
            node.left.left=temp;
            temp=node.right;
            node.right=new TreeNode(v);
            node.right.right=temp;
        }else{
            insert(node.left, v , d , currentDepth+1);
            insert(node.right, v , d , currentDepth+1);
        }
    }
}