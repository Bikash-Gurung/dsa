package problemsolving.array.easy;

public class BitonicPoint {
    //    Given an array arr of n elements which is first increasing and then may be decreasing, find the maximum
    //    element in the array.

    static int findMaximum(int[] arr, int n) {
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
//        int n = 9;
//        int arr[] = {1, 15, 25, 45, 42, 21, 17, 12, 11};

        int n = 5;
        int arr[] = {1, 45, 47, 50, 5};
        System.out.println(findMaximum(arr, n));
    }
}
