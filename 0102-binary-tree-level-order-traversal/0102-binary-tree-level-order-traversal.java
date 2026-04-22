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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) return ans;
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while(!q.isEmpty()){
            int s = q.size();
            List<Integer> level = new ArrayList<>();
            for(int i = 0 ; i < s ; i++){
                TreeNode temp = q.poll();   // pops the front element and return it
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
                level.add(temp.val);
            }
            ans.add(level);
        }
        return ans;
    }
}