class move_zeros{
    public void moveZeroes(int[] arr) {
        int i=0;
        int j=0;
        while(j<arr.length){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;               
            }
            j++;
        }

    }
}