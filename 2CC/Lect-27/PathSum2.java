import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if(root==null){
            return new ArrayList<>();
        }
        List<Integer> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        pathsum(root,targetSum,0,list,ans);
        return ans;
    }
    public void pathsum(TreeNode root, int tar,int curr,List<Integer> list,List<List<Integer>> ans){
        if(root==null){
            return ;
        }
        if(root.left==null&&root.right==null&&curr+root.val==tar){
            list.add(root.val);
            ans.add(new ArrayList<>(list));
            list.remove(list.size()-1);
            return ;
        }
        list.add(root.val);
        pathsum(root.left,tar,curr+root.val,list,ans);
        pathsum(root.right,tar,curr+root.val,list,ans);
        list.remove(list.size()-1);
        return ;
    }
}
