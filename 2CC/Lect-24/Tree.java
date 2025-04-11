import java.util.Scanner;

class Tree{

    class Node{
      int val;
      Node left;
      Node right;
    };
   private Node root;
   Scanner sc=new Scanner(System.in);
   public Tree(){
    this.root=createTree();
   }
   public Node createTree(){
    Node nn=new Node();
    int item=sc.nextInt();
    nn.val=item;

    boolean hlc=sc.nextBoolean();
    if(hlc){
        nn.left=createTree();
    }
    boolean hrc=sc.nextBoolean();
    if(hrc){
        nn.right=createTree();
    }
    return nn;

   }
   public void display(){
    display(root);
   }
   private void display(Node root){
     
    if(root==null){
        return ;
    }
    String s="<--"+root.val+"-->";
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
   public boolean find(int tar){
    return find(root,tar);
   }
   private boolean find(Node root,int tar){

    if(root==null){
        return false;
    }
    if(root.val==tar){
        return true;
    }
    boolean left=find(root.left,tar);
    boolean right=find(root.right, tar);
    return left||right;

   }
   public int max(){
    return max(root);
   }
   private int max(Node root){

    if(root==null){
        return Integer.MIN_VALUE;
    }
    int l=max(root.left);
    int r=max(root.right);
    return Math.max(root.val,Math.max(l,r));
   }

}