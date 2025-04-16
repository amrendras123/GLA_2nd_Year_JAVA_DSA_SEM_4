import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tree {

    class Node {
        int val;
        Node left;
        Node right;
    };

    private Node root;
    Scanner sc = new Scanner(System.in);

    public Tree() {
        this.root = createTree();
    }

    public Node createTree() {
        Node nn = new Node();
        int item = sc.nextInt();
        nn.val = item;

        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree();
        }
        boolean hrc = sc.nextBoolean();
        if (hrc) {
            nn.right = createTree();
        }
        return nn;

    }

    public void display() {
        display(root);
    }

    private void display(Node root) {

        if (root == null) {
            return;
        }
        String s = "<--" + root.val + "-->";
        if (root.left != null) {
            s = root.left.val + s;
        } else {
            s = "." + s;
        }
        if (root.right != null) {
            s = s + root.right.val;
        } else {
            s = s + ".";
        }
        System.out.println(s);
        display(root.left);
        display(root.right);

    }

    public boolean find(int tar) {
        return find(root, tar);
    }

    private boolean find(Node root, int tar) {

        if (root == null) {
            return false;
        }
        if (root.val == tar) {
            return true;
        }
        boolean left = find(root.left, tar);
        boolean right = find(root.right, tar);
        return left || right;

    }

    public int max() {
        return max(root);
    }

    private int max(Node root) {

        if (root == null) {
            return Integer.MIN_VALUE;
        }
        int l = max(root.left);
        int r = max(root.right);
        return Math.max(root.val, Math.max(l, r));
    }
    public void preOrder(){
        preOrder(root);
    }
    private void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void inOrder(){
        inOrder(root);
    }
    private void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public void postOrder(){
        postOrder(root);
    }
    private void postOrder(Node root){
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val+" ");
    }
    public void leveOrder(){
        leveOrder(root);
    }
    private void leveOrder(Node root){
        Queue<Node> q=new LinkedList<>();//queue using LL
        q.add(root);// add root to the queue
        while(!q.isEmpty()){

            Node rv=q.poll();//remove
            System.out.print(rv.val+" ");//print
            if(rv.left!=null){// add left 
                q.add(rv.left);
            }
            if(rv.right!=null){//add right 
                q.add(rv.right);
            }
        }
        
    }
    public int ht(){
       return ht(root);
    }
    private int ht(Node root){

        if(root==null){
            return 0;
        }
        int lht=ht(root.left);
        int rht=ht(root.right);
        return Math.max(lht,rht)+1;
    }

}