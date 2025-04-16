import java.util.Scanner;

class Tree {
    class Node {
        int val;
        Node left;
        Node right;
    };

    private Node root;
    Scanner sc = new Scanner(System.in);

    public void CTree() {
        root = createTree();
    }

    private Node createTree() {
        Node nn = new Node();
        int data = sc.nextInt();
        nn.val = data;

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
        String s = "";
        s = s + root.val;
        s = "<--" + s + "-->";

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

    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.val + " ");

    }

    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);

    }

    public int max() {
        return max(root);
    }

    private int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE;// -infinity
        }
        int lmax = max(root.left);
        int rmax = max(root.right);

        return Math.max(root.val, Math.max(lmax, rmax));
    }

    public int min() {
        return min(root);
    }

    private int min(Node root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        int lmin = min(root.left);
        int rmin = min(root.right);
        return Math.min(root.val, Math.min(lmin, rmin));
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
        boolean lf=find(root.left,tar);
        boolean rf=find(root.right, tar);
        return lf||rf;

    }

}