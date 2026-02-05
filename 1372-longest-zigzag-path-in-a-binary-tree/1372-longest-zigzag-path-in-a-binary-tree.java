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
     int maxi = 0;
    public int longestZigZag(TreeNode root) {
        solve(root,0,true);
         solve(root,0,false);
        return maxi;
    }
     int solve(TreeNode root,int step,boolean goLeft){
        if(root == null){
            return 0;
        }
        maxi = Math.max(maxi,step);
        if(goLeft==true){
            solve(root.left,step+1,false);
            solve(root.right,1,true);
        }else{
            
            solve(root.right,step+1,true);
            solve(root.left,1,false);
        }
        return maxi;
    }
}