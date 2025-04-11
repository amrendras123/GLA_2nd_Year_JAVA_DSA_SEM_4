public class TreeClient {
    public static void main(String[] args) {
        
        Tree bt=new Tree();
        bt.CTree();
        bt.display();
        System.out.println(bt.find(120));
        // 10 true 20 false true 30 false false true 50 true 60 false false false
    }
}
