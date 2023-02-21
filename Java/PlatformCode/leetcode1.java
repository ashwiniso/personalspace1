package PlatformCode;
import java.lang.Math;
import java.util.Collections;
import java.util.Arrays;

public class leetcode1 {
    public static int minimumAverageDifference(int[] nums) {
        Integer[] averages = new Integer[nums.length];

        int counter = 1;
        int index = 56;
        for (int i = 0; i < nums.length; i++) {
            int left = 0, right = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j <= i) {
                    left += nums[j];
                }

            }
            for (int j = i + 1; j < nums.length; j++) {
                right += nums[j];
            }
            System.out.println(left + " " + right);
            if (counter < nums.length) {
                averages[i] = Math.abs((left / counter) - (right / (nums.length - counter)));
                System.out.println(averages[i]);
            } else {
                averages[i] = Math.abs((left / counter) - (right / 1));
                System.out.println(averages[i]);
            }
            counter++;
        }
        index = Arrays.asList(averages).indexOf(Collections.min(Arrays.asList(averages)));
        return index;
    }

    public static void main(String[] args) {
        int[] num = { 2, 3, 4, 10, 6 };
        System.out.println(minimumAverageDifference(num));

    }
}
