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
    int i = 0 ;
    public TreeNode bstFromPreorder(int[] p) {
        return call(p,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    private TreeNode call(int[] p , int min , int max){
        if( p.length <= i )return null;
        int val = p[i];
        if(val < min || val > max ) return null;
        TreeNode root = new TreeNode(val);
        i++;
        root.left = call(p,min,val);
        root.right = call(p,val,max);

        return root;
    }
}