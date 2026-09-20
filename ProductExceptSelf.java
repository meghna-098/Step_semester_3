import java.util.Arrays;

public class ProductExceptSelf {

    static int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] answer = new int[n];

        // Forward pass:
        // answer[i] = product of elements to the left
        int leftProduct = 1;

        for (int i = 0; i < n; i++) {

            answer[i] = leftProduct;

            leftProduct *= nums[i];
        }

        // Backward pass:
        // multiply answer[i] by product of elements to the right
        int rightProduct = 1;

        for (int i = n - 1; i >= 0; i--) {

            answer[i] *= rightProduct;

            rightProduct *= nums[i];
        }

        return answer;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        int[] result = productExceptSelf(nums);

        System.out.println(Arrays.toString(result));
    }
}
