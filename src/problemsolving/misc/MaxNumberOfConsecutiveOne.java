package problemsolving.misc;

public class MaxNumberOfConsecutiveOne {
    /*
     * Input: nums =[1,1,0,1,1,1]
     * Output: 3
     */

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};
//        int[] nums = {1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1};

        int maxNumberOfConsecutiveOne = 0;
        int temp = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                temp += 1;
            } else {
                if (temp > maxNumberOfConsecutiveOne) {
                    maxNumberOfConsecutiveOne = temp;
                }

                temp = 0;
            }
        }

        if (temp > maxNumberOfConsecutiveOne) {
            maxNumberOfConsecutiveOne = temp;
        }

        System.out.println("Max number of consecutive 1 in the given array is: " + maxNumberOfConsecutiveOne);
    }
}
