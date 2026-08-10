class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // base case: empty tree has depth 0
        }
        int leftDepth = maxDepth(root.left);   // depth of left subtree
        int rightDepth = maxDepth(root.right); // depth of right subtree
        return 1 + Math.max(leftDepth, rightDepth); // add current node
    }
}
