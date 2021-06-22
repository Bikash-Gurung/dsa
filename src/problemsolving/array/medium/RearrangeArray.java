package problemsolving.array.medium;

public class RearrangeArray {
//    Given an array arr[] of size N where every element is in the range from 0 to n-1. Rearrange the given array so
//    that arr[i] becomes arr[arr[i]].

    static void arrange(int arr[], int n) {
        int tempArr[] = new int[n];

        for (int i = 0; i < n; i++) {
            tempArr[i] = arr[arr[i]];
        }

        for (int i : tempArr) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int arr[] = {4, 0, 2, 1, 3};
        arrange(arr, n);
    }
}
