package problemsolving.algo.binarysearch;

public class IndexOfFirstOccurrence {
//    static int getIndexOfFirstOccurrence(int[] arr, int item) {
//        int low = 0;
//        int high = arr.length - 1;
//
//        while (low <= high) {
//            int mid = (low + high) / 2;
//            if (arr[mid] == item) {
//                for (low = mid - 1; low >= 0; low--) {
//                    if (low <= 0) return low;
//
//                    if (arr[low] != item) {
//                        return low + 1;
//                    }
//                }
//            }
//
//            if (arr[mid] > item) high = mid - 1;
//            if (arr[mid] < item) low = mid + 1;
//        }
//
//        return -1;
//    }

    static int getIndexOfFirstOccurrence(int[] arr, int item, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] > item) return getIndexOfFirstOccurrence(arr, item, mid - 1, high);
        else if (arr[mid] < item) return getIndexOfFirstOccurrence(arr, item, low, mid + 1);
        else {
            if (mid == 0 || arr[mid - 1] != arr[mid]) return mid;

            return getIndexOfFirstOccurrence(arr, item, low, mid - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 10, 20, 30};
        int item = 20;

//        int[] arr = {10, 20, 30};
//        int item = 15;

//        int[] arr = {15, 15, 15};
//        int item = 15;
        System.out.println(getIndexOfFirstOccurrence(arr, item, 0, arr.length));
    }
}
