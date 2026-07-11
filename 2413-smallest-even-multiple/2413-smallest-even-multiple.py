class Solution:
    def smallestEvenMultiple(self, n: int) -> int:

        if n%2 != 0:
            return n*2
        else:
            res = n//2
            return res*2
        