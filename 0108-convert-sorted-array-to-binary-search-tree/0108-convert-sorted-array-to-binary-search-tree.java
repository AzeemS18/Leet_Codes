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
        return build(0,nums.length - 1, nums);
    }
    private TreeNode build(int l , int r , int[] a){
        if(l>r)return null;
        int m = l + (r - l ) / 2 ;
        TreeNode root = new TreeNode(a[m]);
        root.left = build(l,m-1,a);
        root.right = build(m+1,r,a);
        return root;
    }
}