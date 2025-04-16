public class TreeClient {
    
    public static void main(String[] args) {
        Tree bt=new Tree();
        bt.CTree();
        bt.display();//10 true 20 false true 30 true 40 false false false true 50 false false
        System.out.println();
        bt.preOrder();
        System.out.println();
        bt.inOrder();
        System.out.println();
        bt.postOrder();
    }
}
