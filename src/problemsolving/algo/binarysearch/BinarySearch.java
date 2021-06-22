package problemsolving.algo.binarysearch;

public class BinarySearch {

    // returns the index of the item to be tested

    //Iterative approach
//    static int search(int[] arr, int item) {
//        int low = 0;
//        int high = arr.length - 1;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (arr[mid] == item) return mid;
//            if (arr[mid] > item) high = mid - 1;
//            if (arr[mid] < item) low = mid + 1;
//        }
//
//        return -1;
//    }


    // Recursive approach
    static int search(int[] arr, int item, int low, int high) {
        if (high >= low) {
            int mid = (low + high) / 2;

            if (arr[mid] == item)
                return mid;
            if (arr[mid] > item)
                return search(arr, item, mid - 1, high);

            return search(arr, item, low, mid + 1);
        }

        return -1;
    }

    public static void main(String[] args) {
        // Considering array is sorted
        int[] arr = {10, 20, 30, 40, 50};
        int x = 50;
//        System.out.println(search(arr, x));
        System.out.println(search(arr, x, 0, arr.length));
    }
}
