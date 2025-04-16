public class TreeClient {
    public static void main(String[] args) {
        Tree bt=new Tree();
        bt.display();
        System.out.println(bt.find(100));
        System.out.println(bt.max());
         //10 true 20 true 30 false true 50 false false false true 40 true 60 false false false
    }
}
