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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer>a=new ArrayList<>();
        Stack<TreeNode>s=new Stack<>();
        if(root==null)
            return a;
        s.push(root);
        while(!s.isEmpty())
        {
           root=s.pop();
           a.add(root.val);
               if(root.right!=null)
                   s.push(root.right);
            if(root.left!=null)
                s.push(root.left);
        }
        return a;
    }
}