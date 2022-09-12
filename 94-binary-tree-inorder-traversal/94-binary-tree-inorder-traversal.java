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
   public void pushAllLeft(TreeNode root , Stack stack){
       while(root!=null){
           stack.add(root);
           root=root.left;
       }
   }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        
        Stack<TreeNode> stack = new Stack<>();
        pushAllLeft(root , stack);
        while(!stack.isEmpty()){
            TreeNode curr = stack.pop();
            list.add(curr.val);
            pushAllLeft(curr.right , stack);
        }
       
        return list;
    }
}




