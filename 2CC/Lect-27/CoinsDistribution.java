public class CoinsDistribution {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    int cnt=0;
    public int distributeCoins(TreeNode root) { 
        minc(root);
        return cnt;
    }
    public int minc(TreeNode root){
        if(root==null){
            return 0;
        }
        int lc=minc(root.left);
        int rc=minc(root.right);
        cnt+=Math.abs(lc)+Math.abs(rc);
        return lc+rc+root.val-1;
    }
}