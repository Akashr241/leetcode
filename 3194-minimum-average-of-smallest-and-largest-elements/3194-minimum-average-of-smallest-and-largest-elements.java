class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);

        int len = nums.length;
        double min = 100;

        for (int i = 0; i < len / 2; i++) {
            double num = (nums[i] + nums[len - i - 1]) / 2.0;

            min = min > num ? num : min;
        }

        return min;
    }
}