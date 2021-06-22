package datastructures.linear;

public class JavaArray {
    static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return arr;
    }

    static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }

    static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        arr = reverse(arr);
        print(arr);
        System.out.println("\nMinimum value in array " + findMin(arr));
        System.out.println("Maximum value in array " + findMax(arr));

//        int[] temp = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        arr = temp;
//        print(arr);
    }
}
