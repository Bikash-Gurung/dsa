package problemsolving.array.easy;

public class Divisibleby3 {

//    Given an array arr of integers of length N, the task is to find whether it’s possible to construct an integer
//    using all the digits of these numbers such that it would be divisible by 3. If it is possible then print “1”
//    and if not print “0”.

//    static int isPossible(int arr[], int n) {
//        int remainder = 0;
//        for (int i = 0; i < n; i++)
//            remainder = (remainder + arr[i]) % 3;
//
//        return remainder == 0 ? 1 : 0;
//    }

    static int isPossible(int arr[], int n) {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        return sum % 3 == 0 ? 1 : 0;
    }

    public static void main(String[] args) {
        int[] arr = {40, 50, 90};
        System.out.println(isPossible(arr, 3));
    }
}
