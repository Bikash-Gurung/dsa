package problemsolving.misc;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class KthMissingPositiveNumber {
    // Naive solution
//    static int findKthPositive(int[] arr, int k) {
//        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
//        List<Integer> tempList = getArrayOfSizeN(arr[arr.length - 1] + k);
//        tempList = tempList
//                .stream()
//                .filter(num -> !arrList.contains(num))
//                .collect(Collectors.toList());
//
//        return tempList.get(k - 1);
//    }
//
//    static List<Integer> getArrayOfSizeN(int n) {
//        List<Integer> list = new ArrayList<>();
//
//        for (int i = 0; i < n; i++) {
//            list.add(i + 1);
//        }
//
//        return list;
//    }

    // Optimized solution
    static int findKthPositive(int[] arr, int k) {
        for (int i = 0, n = 1; n <= 1000; n++) {
            if (i < arr.length && arr[i] == n)
                i++;
            else
                k--;
            if (k == 0)
                return n;
        }

        return 1000 + k;
    }

    public static void main(String[] args) {
//        int[] arr = {2, 3, 4, 7, 11};
//        int position = 5; //9

        int[] arr = {1, 2, 3, 4};
        int position = 2; //6

        System.out.println(findKthPositive(arr, position));
    }
}
