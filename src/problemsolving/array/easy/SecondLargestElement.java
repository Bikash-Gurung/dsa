package problemsolving.array.easy;

public class SecondLargestElement {

    //returns the element
    static int finSecondLargestElement(int[] arr) {
        int largest = 0;
        int secondLargest = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < largest && arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
//        int[] arr = {1, 30, 20, 30, 50, 10, 45, 40};
        int[] arr = {1, 40, 30, 20, 30, 50, 10, 40};
        System.out.println(finSecondLargestElement(arr));
    }
}
