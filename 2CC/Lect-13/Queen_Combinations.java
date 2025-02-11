public class Queen_Combinations {
   

        public static void main(String[] args) {
            int n=4;
            boolean[] box=new boolean[n];
            int tq=2;
            queen(box,tq,0,0,"");
        }
       public static void queen(boolean[] box,int tq,int idx,int qpsf,String ans){
        if(tq==qpsf){
            System.out.println(ans);
            return;
        }
        for(int i=idx;i<box.length;i++){
            if(box[i]==false){
                box[i]=true;
                queen(box, tq,i+1, qpsf+1, ans+"b"+i+"q"+qpsf);
                box[i]=false;//backtracking step
            }
        }
       }
    
}
