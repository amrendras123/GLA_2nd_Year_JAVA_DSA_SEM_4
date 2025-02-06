public class TOh {
    public static void main(String[] args) {
        int n=3;
        toh(n,"A","B","c");
    }
    public static void toh(int n,String t1,String t2,String t3){
        if(n==0){
            return;
        }
        toh(n-1,t1,t3,t2);
        System.out.println(n+ "-> move "+t1+" to " +t2);
        toh(n-1,t3,t2,t1);
    }
}
