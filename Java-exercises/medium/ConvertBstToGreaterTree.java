class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class ConvertBstToGreaterTree
{
    private int sum = 0;

    public TreeNode convertBST(TreeNode root) 
	{
        if (root != null) 
		{
            // Traverse the right subtree first
            convertBST(root.right);
            
            // Update the sum and the current node's value
            sum += root.val;
            root.val = sum;
            
            // Traverse the left subtree
            convertBST(root.left);
        }
        return root;
    }

   
}
