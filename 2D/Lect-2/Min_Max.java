public class Min_Max {

    public static int[] findMinMax(int[] arr) {
        // Initialize min and max with the first element
        int minVal = arr[0];
        int maxVal = arr[0];
        
        // Iterate through the array to find the min and max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minVal) {
                minVal = arr[i];
            }
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        
        // Return min and max as an array
        return new int[] { minVal, maxVal };
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 0, -2, 9};
        int[] minMax = findMinMax(arr);
        
        System.out.println("Min: " + minMax[0]);
        System.out.println("Max: " + minMax[1]);
    }
}