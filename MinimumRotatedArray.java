public class MinimumRotatedArray {

    static int findMin(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {

                // Minimum is to the right of mid
                left = mid + 1;

            } else {

                // Minimum is at mid or to the left
                right = mid;
            }
        }

        return nums[left];
    }

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.println(findMin(nums));
    }
}
