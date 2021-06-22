package problemsolving.array.easy;

public class Segregate0and1 {
//    Given an array of length N consisting of only 0s and 1s in random order. Modify the array to segregate 0s on
//    left side and 1s on the right side of the array.

    // First solution: time limit exceeded
//    static void segregate0and1(int arr[], int n) {
//        int pointerOne = 0;
//        int pointerTwo = n - 1;
//
//        while (pointerTwo > pointerOne) {
//            if (arr[pointerOne] == 0 && arr[pointerTwo] == 0) {
//                pointerOne++;
//                continue;
//            }
//
//            if (arr[pointerOne] == 1 && arr[pointerTwo] == 1) {
//                pointerTwo--;
//                continue;
//            }
//
//            if (arr[pointerOne] == 1 && arr[pointerTwo] == 0) {
//                arr[pointerOne] = 0;
//                arr[pointerTwo] = 1;
//            }
//
//            pointerOne++;
//            pointerTwo--;
//        }
//
//        for (int i : arr) {
//            System.out.println(i);
//        }
//    }

    //second solution: time limit exceeded
//    static void segregate0and1(int arr[], int n) {
//        int numberOfZero = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] == 0) {
//                numberOfZero++;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (numberOfZero != 0) {
//                arr[i] = 0;
//                numberOfZero--;
//            } else {
//                arr[i] = 1;
//            }
//        }
//
//        for (int i : arr) {
//            System.out.println(i);
//        }
//    }

    //third solution: Accepted in Geeks for Geeks
    static void segregate0and1(int arr[], int n) {
        int pointerZero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                arr[pointerZero] = 0;
                pointerZero++;
            }
        }

        if (pointerZero != n) {
            for (int i = pointerZero; i < n; i++) {
                arr[i] = 1;
            }
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {0, 0, 1, 1, 0};
        segregate0and1(arr, n);
    }
}
