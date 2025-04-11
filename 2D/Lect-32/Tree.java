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
//hw
}


}