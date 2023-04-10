import java.util.Arrays;

public class MaxSubArraySum {

    public static int maxSubArray(int[] nums) {
        int max_sum = nums[0];
        int curr_sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            curr_sum = Math.max(nums[i], curr_sum + nums[i]);
            max_sum = Math.max(max_sum, curr_sum);
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int max_sum = maxSubArray(nums);
        System.out.println("Maximum contiguous sum is: " + max_sum);
    }
}
