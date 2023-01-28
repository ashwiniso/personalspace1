import java.util.Arrays;

public class leetcode2 {
    public static int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { j, i };
                }
            }
        }
        return indices;

    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

}
