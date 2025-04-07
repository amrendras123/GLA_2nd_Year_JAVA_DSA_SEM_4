import java.util.ArrayList;
import java.util.Scanner;

public class Tree {

    class Node{
        int val;
        // ArrayList<Node> al;
        Node left;
        Node right;
    }
   private Node root;
   Scanner sc=new Scanner(System.in);

   public void creatTree(){

    Node nn=new Node();
    int item=sc.nextInt();
    nn.val=item;

    boolean hlc=sc.nextBoolean();
    if(hlc){
       creatTree(); 
    }
    boolean hrc=sc.nextBoolean();
    if(hrc){
        creatTree();
    }


   }
}