public class LCABST {

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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        if(root==null){
            return null;
        }
        if(root.val<p.val&&root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }else if(root.val>p.val&&root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }else{
            return root;
        }
    }
}