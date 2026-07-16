class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:

        l1 = [0] * (2*n)
        for i in range(n):
            l1[2*i] = nums[i]
            l1[2*i+1] = nums[n+i]
        return l1
        