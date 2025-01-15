public class Container_With_most_water {
    public int maxArea(int[] arr) {   
        int max=0;
       int i=0;
       int j=arr.length-1;
       while(i<=j){
        int area=Math.min(arr[i],arr[j])*(j-i);
        max=Math.max(area,max);
        if(arr[i]<arr[j])
        i++;
        else{
            j--;
        }
       }
       return max;
    }
}
