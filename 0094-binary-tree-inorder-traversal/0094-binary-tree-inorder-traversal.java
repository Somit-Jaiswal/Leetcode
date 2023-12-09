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
    public List<Integer> inorderTraversal(TreeNode root) {
        Deque<TreeNode> stack = new ArrayDeque<>(101);
        List<Integer> result = new ArrayList<>(101);
        Set<TreeNode> visitedLeft = new HashSet<>();
        if (root != null) {
            stack.offer(root);
        }
        while (!stack.isEmpty()) {
            TreeNode node = stack.peekLast();
            while (node.left != null && !visitedLeft.contains(node)) {
                stack.offer(node.left);
                visitedLeft.add(node);
                node = node.left;
            }
            result.add(node.val);
            stack.pollLast();
            if (node.right != null) {
                stack.offer(node.right);
            }
        }
        return result;
    }
}