class Solution:
    def leftRightDifference(self, nums: List[int]) -> List[int]:

        l1 = []
        
        for i in range(len(nums)):
            l =0
            r = 0
            for j in range(0, i):
                l += nums[j]
            for k in range(i+1, len(nums)):
                r += nums[k]
            l1.append(abs(l-r))
        return l1

        