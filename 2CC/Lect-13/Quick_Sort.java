public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = { 1, 8, 7, 6, 5, 4, 3, 2, 1 };
        print(arr);
        quick(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void quick(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int pivot = part(arr, lo, hi);
        quick(arr, lo, pivot - 1);
        quick(arr, pivot + 1, hi);

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
        int temp = arr[idx];
        arr[idx] = arr[hi];
        arr[hi] = temp;

        return idx;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("*********************************");
    }
}
