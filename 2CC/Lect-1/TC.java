import java.io.*;

class TC {

    static int list_Sum(int[] A, int n)

    // A->array and
    // n->number of elements in array
    {
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum = sum + A[i];
        }
        return sum;
    }

    public static void main(String[] args)
    {
        int[] A = { 5, 6, 1, 2 };
        int n = A.length;
        System.out.println(list_Sum(A, n));
    }
}
