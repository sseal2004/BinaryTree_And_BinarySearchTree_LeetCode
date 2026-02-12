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
        int idx = 0;

    public void recoverTree(TreeNode root) {
        ArrayList<Integer>list = new ArrayList<>();
        preorder(root,list);
        Collections.sort(list);
        inorder2(root,list);

    }
    public void preorder(TreeNode root,List<Integer>list){
        if(root==null)return ;

        list.add(root.val);
        preorder(root.left,list);
        preorder(root.right,list);

    }
      private void inorder2(TreeNode root, List<Integer> res){
        if(root == null)    return;
        inorder2(root.left, res);
        root.val = res.get(idx++);
        inorder2(root.right, res);
    }
}