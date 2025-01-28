class PD{
    public static void main(String[] args) {
        int n=5;
        pd(n);
    }
    public static void pd(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        pd(n-1);

    }
}