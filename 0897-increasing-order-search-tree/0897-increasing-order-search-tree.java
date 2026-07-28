class Solution {
    TreeNode prev = null;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummy = new TreeNode(0);
        prev = dummy;
        inorder(root);
        return dummy.right;
    }
    private void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        node.left = null;    
        prev.right = node;     
        prev = node;    
        inorder(node.right);
    }
}