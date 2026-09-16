class Solution {
    public int findMaxK(int[] nums) {
        int largPositive = -1;

        HashSet<Integer> set = new HashSet<>();

        for(int num : nums)
        {
            if(set.contains(-num))
            {
                largPositive = Math.max(largPositive, Math.abs(-num));
            }
            set.add(num);  
        }
        return largPositive;
    }
}