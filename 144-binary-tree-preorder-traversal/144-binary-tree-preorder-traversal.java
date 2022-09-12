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
// class Solution {
//     public List<Integer> preorderTraversal(TreeNode root) {
//         LinkedList<Integer> res = new LinkedList<Integer>();
        
//         if(root == null) return res;
//         res.add(root.val);
//         res.addAll(preorderTraversal(root.left));
//         res.addAll(preorderTraversal(root.right));
//         return res;
//     }
// }

class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        if(root==null) return res;
        Stack<TreeNode> toVisit = new Stack<TreeNode>();
        toVisit.push(root);
        while(!toVisit.empty()){
            TreeNode visiting =toVisit.pop();
            res.add(visiting.val);
            if(visiting.right!=null){
                toVisit.push(visiting.right);
            }
              if(visiting.left!=null){
                toVisit.push(visiting.left);
            }
        }
        return res;
    }
}