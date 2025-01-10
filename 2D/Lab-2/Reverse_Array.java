public class Reverse_Array {
    public void rev(int[] arr,int si,int ei){
    
        while(si<=ei){
            int temp=arr[si];
         arr[si]=arr[ei];
         arr[ei]=temp;
         si++;
         ei--;
        }
    }
}
