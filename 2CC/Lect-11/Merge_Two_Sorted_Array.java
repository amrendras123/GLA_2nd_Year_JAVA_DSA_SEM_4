public class Merge_Two_Sorted_Array {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] ans = new int[nums1.length];
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                ans[k] = nums1[i];
                i++;
                k++;
            } else {
                ans[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            ans[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            ans[k] = nums2[j];
            j++;
            k++;
        }
        for (int m1 = 0; m1 < ans.length; m1++) {
            nums1[m1] = ans[m1];
        }

    }
}
