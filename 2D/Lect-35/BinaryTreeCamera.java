
public class BinaryTreeCamera {
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
     int cam=0;
    public int minCameraCover(TreeNode root) {
        if(minc(root)==-1){
            cam++;
        }
        return cam;
    }
    public int minc(TreeNode root){
        if(root==null){
            return 1;
        }
        int left=minc(root.left);
        int right=minc(root.right);
        if(left==-1||right==-1){
            cam++;
            return 0;
        }else if(left==0||right==0){
            return 1;
        }
        return -1;
    }
}
