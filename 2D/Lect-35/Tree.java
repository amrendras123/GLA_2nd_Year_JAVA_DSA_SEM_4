import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tree {

    class Node{
        int val;
        Node left;
        Node right;
    }
   private Node root;
   Scanner sc=new Scanner(System.in);
  //create tree
   public void CTree(){
      this.root=creatTree();
   }
   private Node creatTree(){
    Node nn=new Node();
    int item=sc.nextInt();
    nn.val=item;

    boolean hlc=sc.nextBoolean();//hlc=has left child
    if(hlc){
      nn.left= creatTree(); 
    }
    boolean hrc=sc.nextBoolean();//hrc=has right child
    if(hrc){
       nn.right= creatTree();
    }
    return nn;
   }
   //display
   public void display(){
      display(root);
   }
   private void display(Node root){
    if(root==null){
        return;
    }
    String s="";
    s=s+root.val;
    s="<--"+s+"-->";
    if(root.left!=null){
        s=root.left.val+s;
    }else{
        s="."+s;
    }
    if(root.right!=null){
        s=s+root.right.val;
    }else{
        s=s+".";
    }
    System.out.println(s);
    display(root.left);
    display(root.right);

}
//find
public boolean find(int val){
    return find(root,val);
}
private boolean find(Node root,int tar){

    if(root==null){
        return false;
    }
    if(root.val==tar){
        return true;
    }
    boolean left=find(root.left,tar);
    boolean right=find(root.right,tar);
    return left||right;
}
//max
public int findMax(){
   return max(root);
}
private int max(Node root){
    if(root==null){
        return Integer.MIN_VALUE;
    }

    int lmax=max(root.left);
    int rmax=max(root.right);

    return Math.max(root.val,Math.max(lmax,rmax));
}
public int findmin(){
     return findMin(root);
}
private int findMin(Node root){
    if(root==null){
        return Integer.MAX_VALUE;
    }
    int lmin=findMin(root.left);
    int rmin=findMin(root.right);
    return Math.min(root.val,Math.min(lmin,rmin));
}
public void preOrder(){
    preOrder(root);
}
private void preOrder(Node root){

    if(root==null){
        return ;
    }
    System.out.println(root.val+" ");
    preOrder(root.left);
    preOrder(root.right);
}
public void inOrder(){
    inOrder(root);
}
private void inOrder(Node root){

    if(root==null){
        return ;
    }
  
    inOrder(root.left);
    System.out.println(root.val+" ");
    inOrder(root.right);
}
public void postOrder(){
    postOrder(root);
}
private void postOrder(Node root){

    if(root==null){
        return ;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.println(root.val+" ");

}
public int cntNode(){
   return cntNode(root);
}
private int cntNode(Node root){
   
    if(root==null){
        return 0;
    }
    return cntNode(root.left)+cntNode(root.right)+1;
}
public void levelOrder(){
    levelOrder(root);
}
private void levelOrder(Node root){
    Queue<Node> q=new LinkedList<>();
    q.add(root);
    while(!q.isEmpty()){
        Node rv=q.poll();
        System.out.println(rv.val);
        if(rv.left!=null){
            q.add(rv.left);
        }
        if(rv.right!=null){
            q.add(rv.right);
        }
    }


}



}