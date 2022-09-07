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
    
    public List<List<Integer>> levelOrder(TreeNode node) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        Queue<TreeNode> curr  = new ArrayDeque< >();;
        Queue<TreeNode> next  = new ArrayDeque<>();
        if(node==null) return list;  //null pointer exception
        curr.add(node);
        while(curr.size()>0){
            List<Integer> level = new ArrayList<Integer>();
            int size =  curr.size();
            for(int i=0;i<size;i++){
                
            
            TreeNode rem = curr.remove();
            level.add(rem.val);
            
            if(rem.left!=null) next.add(rem.left);
            if(rem.right!=null) next.add(rem.right);
            }
            if(curr.size()==0){
                Queue<TreeNode> temp  = curr;
                curr= next;
                next= temp;
            }
            list.add(level);
        }
        return list;
        
    }
}