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
         List<List<Integer>>a=new ArrayList<>();
          Queue<TreeNode>q=new LinkedList<>();
        if(root==null) return a;
        q.offer(root);
        while(!q.isEmpty())
        {
            int levelNum=q.size();
            List<Integer>b=new ArrayList<>();
            for(int i=0;i<levelNum;i++)
            {
                if(q.peek().left!=null)
                    q.offer(q.peek().left);
                if(q.peek().right!=null)
                    q.offer(q.peek().right);
                b.add(q.poll().val);
            }
            a.add(b);
        }
        return a;
        
    }
}