package problemsolving.algo.binarysearch;

public class ElementInAlmostSortedAarray {
//    Given an array which is sorted, but after sorting some elements are moved to either of the adjacent positions,
//    i.e., arr[i] may be present at arr[i+1] or arr[i-1]. Write an efficient function to search an element in this
//    array. Basically the element arr[i] can only be swapped with either arr[i+1] or arr[i-1]

    static int searchIndex(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) return mid;

            if (mid - 1 >= low && arr[mid - 1] == target) return mid - 1;

            if (mid + 1 <= high && arr[mid + 1] == target) return mid + 1;

            if (arr[mid] < target) low = mid + 2;

            if (arr[mid] > target) high = mid - 2;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 3, 40, 20, 50, 80, 70};
        int target = 50;
        System.out.println(searchIndex(arr, target));
    }
}
