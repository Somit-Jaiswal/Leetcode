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
public List preorderTraversal(TreeNode root) {
 
        ArrayList<Integer> preorder = new ArrayList <>();
        TreeNode cur=root;
        while (cur != null) {
            if (cur.left==null) {//if there is no left element
                preorder.add(cur.val);
                cur =cur.right;
            }else{
                TreeNode prev = cur.left;
                while (prev.right !=null && prev.right != cur) {//if there exsit a right and the right is not pointing himself
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = cur;//create the thread
                    preorder.add(cur.val);
                    cur = cur.left;
                } else {
                    prev.right = null;  //cut the thread
                    cur = cur.right;
                }
            }
        }
        return preorder;
    }
} 