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
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<Integer>();
        if(root == null) return res;
        
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode curr= stack.pop();
            res.addFirst(curr.val);
            if(curr.left!=null){
                stack.push(curr.left);
            }
             if(curr.right!=null){
                stack.push(curr.right);
            }
        }
        return res;
        
        }
}