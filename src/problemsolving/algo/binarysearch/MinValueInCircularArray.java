package problemsolving.algo.binarysearch;

public class MinValueInCircularArray {
//    static int findMin(int[] nums) {
//        int low = 0;
//        int high = nums.length - 1;
//        int result = 0;
//
//        while (low <= high) {
//            int mid = low + (high - low) / 2;
//            int prev = (mid + nums.length - 1) % nums.length;
//            int next = (mid + 1) % nums.length;
//
////            {4, 5, 6, 7, 0, 1, 2}
//            if (nums[mid] <= nums[next] && nums[mid] <= nums[prev]) {
//                result = mid;
//            }
//
//            if (nums[mid] >= nums[low]) {
//                low = mid + 1;
//            } else if (nums[mid] <= nums[high]) {
//                high = mid - 1;
//            }
//        }
//
//        return nums[result];
//    }

//    static int findMin(int[] nums) {
//        int left = 0, right = nums.length - 1;
//        if (nums.length == 1 || nums[0] < nums[nums.length - 1])
//            return nums[0];
//
//        while (left < right) {
//            int mid = left + (right - left) / 2;
//
////            {4, 5, 6, 7, 0, 1, 2}
//            if (nums[mid] >= nums[left]) {
//                if (nums[mid] <= nums[right]) {
//                    right = mid;
//                } else {
//                    left = mid + 1;
//                }
//            } else {
//                right = mid;
//            }
//        }
//
//        return nums[left];
//    }

    static int findMin(int[] nums) {
        int mn = nums[0],low = 0,high = nums.length-1;

        if(nums.length == 1 || nums[0] < nums[nums.length-1])
            return nums[0];

        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(nums[mid] >= mn)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return nums[low];
    }

    public static void main(String[] args) {
//        int[] nums = {4, 5, 6, 7, -2, -1, 0, 1, 2};
        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(findMin(nums));
    }
}
