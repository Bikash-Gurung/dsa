package problemsolving.array.easy;

public class SumOfArrayElements {
//    Given an integer array arr of size n, you need to sum the elements of arr.

    static int sumElement(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int n = 4;
        int[] array = {1, 2, 3, 4};
        System.out.println(sumElement(array, n));
    }
}
