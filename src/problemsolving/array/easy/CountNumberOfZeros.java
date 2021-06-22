package problemsolving.array.easy;

public class CountNumberOfZeros {
//    Given an array of size N consisting of only 0's and 1's. The array is sorted in such a manner that all the 1's
//    are placed first and then they are followed by all the 0's. Find the count of all the 0's.

    static int countZeroes(int arr[], int n) {
        int i;

        for (i = 0; i < n; i++) {
            if (arr[i] == 0) {
                break;
            }
        }

        return n - i;
    }

    public static void main(String[] args) {
//        int n = 12;
//        int[] arr = {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};

        int n = 5;
        int[] arr = {0, 0, 0, 0, 0};

        System.out.println(countZeroes(arr, n));
    }
}
