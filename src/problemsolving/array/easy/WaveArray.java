package problemsolving.array.easy;

public class WaveArray {

//    Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it. In other
//    words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the
//    increasing lexicographical order).

    static int[] convertToWave(int[] arr, int n) {
        for (int i = 0, temp; i < n; i += 2) {
            temp = arr[i];

            if ((i + 1) < n) {
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
//        int n= 5;
//        int[] array = {1, 2, 3, 4, 5};

        int n = 6;
        int[] array = {2, 4, 7, 8, 9, 10};
        for (int number : convertToWave(array, n)) {
            System.out.println(number);
        }
    }
}
