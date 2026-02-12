/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val ==root.val||q.val ==root.val)return root;
        else if(p.val<root.val && q.val > root.val)return root;
        else if(p.val >root.val && q.val< root.val)return root;
        // when 2 and 4 both are less than 6 then go left and now the root is 2
        else if(p.val< root.val && q.val < root.val)return lowestCommonAncestor(root.left,p,q);
        //so now root is 2 so p.val = 2 > 2 and q.val =4 > 2 condition satisfied go to right
        else return lowestCommonAncestor(root.right,p,q);
    }
}