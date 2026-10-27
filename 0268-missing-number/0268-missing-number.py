class Solution(object):
    def missingNumber(self, nums):
        n=len(nums)
        Tsum = (n * (n + 1)) // 2
        actal_sum = sum (nums)
        return Tsum-actal_sum
      