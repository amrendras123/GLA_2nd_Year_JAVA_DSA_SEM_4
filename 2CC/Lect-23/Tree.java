import java.util.Scanner;

class Tree{

    class Node{
      int val;
      Node left;
      Node right;
    };
   private Node root;
   Scanner sc=new Scanner(System.in);
   public void createTree(){
    Node nn=new Node();
    int item=sc.nextInt();
    nn.val=item;

    boolean hlc=sc.nextBoolean();
    if(hlc){
        createTree();
    }
    boolean hrc=sc.nextBoolean();
    if(hrc){
        createTree();
    }

   }

}