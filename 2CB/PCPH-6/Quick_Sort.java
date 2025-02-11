public class Quick_Sort {

    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 1, 5, 6, 7, 8, 321, 3, 4, 5 };
        quick(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quick(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int idx = part(arr, lo, hi);
        quick(arr, lo, idx - 1);
        quick(arr, idx + 1, hi);
    }

    public static int part(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int idx = lo;
        for (int i = lo; i < hi; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                idx++;
            }
        }
        int temp = arr[hi];
        arr[hi] = arr[idx];
        arr[idx] = temp;
        return idx;
    }
}