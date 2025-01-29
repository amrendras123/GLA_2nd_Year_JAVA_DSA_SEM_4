class PI{
    public static void main(String[] args) {
        int n=5;
        pd(n);
    }
    public static void pd(int n){
        if(n==0){
            return ;
        }
        pd(n-1);
        System.out.println(n);

    }
}