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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> wl = new ArrayList<>();
        if(root == null) return wl;
        
        queue.offer(root);
        boolean flag = true;
        while(!queue.isEmpty()){
            int levelNum=queue.size();
            ArrayList<Integer> subList=new ArrayList<>();
            for(int i=0;i<levelNum;i++){
                int index =i;
                 if (queue.peek().left != null) queue.offer(queue.peek().left);
                if (queue.peek().right != null) queue.offer(queue.peek().right);
                if (flag == true) subList.add(queue.poll().val);
                else subList.add(0, queue.poll().val);
                
            }
            flag=!flag;
            wl.add(subList);
        }
        return wl;
    }
}