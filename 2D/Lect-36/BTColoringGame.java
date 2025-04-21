public class BTColoringGame {
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
           public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
               
               TreeNode fnd=find(root,x);
               int lc=cnt(fnd.left);
               int rc=cnt(fnd.right);
               int parent=n-lc-rc-1;
       
               return Math.max(lc,Math.max(rc,parent))>n/2;
       
           }
           public TreeNode find(TreeNode root, int x){
               if(root==null){
                   return null;
               }
               if(root.val==x){
                   return root;
               }
               TreeNode lf=find(root.left,x);
               TreeNode rf=find(root.right,x);
               if(lf==null){
                   return rf;
               }
               return lf;
       
           }
           public int cnt(TreeNode root){
       
               if(root==null){
                   return 0;
               }
               return cnt(root.left)+cnt(root.right)+1;
           }
}
