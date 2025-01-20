public class MergeTwoSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int[] ans=new int[m+n];

        while(i<m&&j<n){
            if(nums1[i]<nums2[j]){
                ans[k]=nums1[i];
                i++;
                k++;
            }else{
                ans[k]=nums2[j];
                j++;
                k++;
            }
        }
        while(i<m){
            ans[k]=nums1[i];
                i++;
                k++;
        }
        while(j<n){
              ans[k]=nums2[j];
                j++;
                k++;
        }
        for(int a=0;a<ans.length;a++){
            nums1[a]=ans[a];
        }
    }
}