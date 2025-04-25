public class ConvertSortedArrayintoBST {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        return bst(nums, 0, nums.length - 1);
    }

    public TreeNode bst(int[] nums, int lo, int hi) {
        if (lo > hi) {
            return null;
        }
        int mid = (lo + hi) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = bst(nums, lo, mid - 1);
        root.right = bst(nums, mid + 1, hi);
        return root;
    }
}