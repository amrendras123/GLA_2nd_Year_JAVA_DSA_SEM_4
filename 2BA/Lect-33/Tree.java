import java.util.Scanner;

class Tree{
    class Node{
        int val;
        Node left;
        Node right;
    };

   private Node root;
   Scanner sc=new Scanner(System.in);

   public void CTree(){
    root=createTree();
   }
   private Node createTree(){
     Node nn=new Node();
     int data=sc.nextInt();
     nn.val=data;

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
   

}