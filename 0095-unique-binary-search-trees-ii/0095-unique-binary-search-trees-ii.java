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
    public List<TreeNode> generateTrees(int n) {
        if(n==0)return new ArrayList<>();
        return call( 1 , n );
    }
    private List<TreeNode> call(int s , int e){
        List<TreeNode> list = new ArrayList<>();
        if( s > e){
            list.add(null);
            return list;
        }
        for(int i = s ; i <= e ; i++){
            List<TreeNode> lt = call(s,i-1);
            List<TreeNode> rt = call(i+1,e);
            for(TreeNode l : lt){
                for(TreeNode r : rt){
                    TreeNode root = new TreeNode(i);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                }
            }
        }
        return list;
    }
}