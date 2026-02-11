/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
 public TreeNode sortedArrayToBST(int[] nums) {
     return buildBST(nums,0, nums.length-1);
        
    }
    TreeNode buildBST(int[]nums,int start,int end){
           
        int mid = start+(end-start)/2;
        if(start>end)return null;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildBST(nums,start,mid-1);
        root.right = buildBST(nums,mid+1,end);
        return root;
    }   
     public TreeNode sortedListToBST(ListNode head) {
        if (head == null) return null;

        // 1️⃣ Count nodes
        int n = 0;
        ListNode temp = head;
        while (temp != null) {
            n++;
            temp = temp.next;
        }

        // 2️⃣ Convert list to array
        int[] arr = new int[n];
        temp = head;
        int i = 0;
        while (temp != null) {
            arr[i++] = temp.val;
            temp = temp.next;
        }

        // 3️⃣ Reuse sortedArrayToBST
        return sortedArrayToBST(arr);
     }

}