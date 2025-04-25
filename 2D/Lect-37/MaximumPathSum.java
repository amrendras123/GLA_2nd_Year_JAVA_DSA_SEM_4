public class MaximumPathSum {
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
    public int maxPathSum(TreeNode root) {
        int[] arr=new int[1];
        arr[0]=Integer.MIN_VALUE;
        maxsum(root,arr);
        return arr[0];
    }
    public int maxsum(TreeNode root,int[] arr){
        if(root==null){
            return 0;
        }
        int lmax=Math.max(0,maxsum(root.left,arr));
        int rmax=Math.max(0,maxsum(root.right,arr));
        
        arr[0]=Math.max(arr[0],lmax+rmax+root.val);
         return Math.max(lmax,rmax)+root.val;
    }
}
