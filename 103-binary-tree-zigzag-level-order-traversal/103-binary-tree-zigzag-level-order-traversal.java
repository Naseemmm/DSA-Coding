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
        List<List<Integer>> a=new ArrayList<>();
        Queue<TreeNode>q=new LinkedList<>();
        boolean flag=true;
        if(root==null)
            return a;
        q.offer(root);
        while(!q.isEmpty())
        {
            List<Integer>b=new ArrayList<>();
            int level=q.size();
            for(int i=0;i<level;i++)
            {
                if(q.peek().left!=null)
                    q.offer(q.peek().left);
                if(q.peek().right!=null)
                    q.offer(q.peek().right);
                if (flag==true)
                b.add(q.poll().val);
                else
                    b.add(0,q.poll().val);
            }
            flag=!flag;
            a.add(b);
        }
        return a;
    }
}