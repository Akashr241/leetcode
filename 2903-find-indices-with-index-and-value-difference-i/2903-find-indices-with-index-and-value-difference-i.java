class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int n = nums.length;
        int minIndex = 0;
        int maxIndex = 0;
        // We "drag" the minimum tracking behind us
        for(int i = indexDifference; i < n; i++) {
            if(nums[i - indexDifference] > nums[maxIndex]) {
                maxIndex = i - indexDifference;
            }
            if(nums[i - indexDifference] < nums[minIndex]) {
                minIndex = i - indexDifference;
            }
            if(nums[maxIndex] - nums[i] >= valueDifference) {
                return new int[]{maxIndex,i};
            }
            if(nums[i] - nums[minIndex] >= valueDifference) {
                return new int[]{minIndex,i};
            }
        }
        return new int[]{-1,-1};
    }
}