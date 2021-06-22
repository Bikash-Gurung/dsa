package problemsolving.misc;

public class ReverseArray {

    static char[] reverse(char[] arr) {
        int size = arr.length;

        // swap first and last item
        char temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;

        int lastIndex = size - 2;

        //swap remaining items
        for (int i = 1; i < size - 2; i++) {
            if (i >= lastIndex) {
                break;
            }

            temp = arr[i];
            arr[i] = arr[lastIndex];
            arr[lastIndex] = temp;

            lastIndex--;
        }

        return arr;
    }

    public static void main(String[] args) {
        char[] arr = {'H', 'e', 'l', 'l', 'o'};

        System.out.println(ReverseArray.reverse(arr));
    }


    //Technique: Opposite directional two pointer technique
    //Time Complexity: O(n)
    //Space Complexity: O(1)
}
