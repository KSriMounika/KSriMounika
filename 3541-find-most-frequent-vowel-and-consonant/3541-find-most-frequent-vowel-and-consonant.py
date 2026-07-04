class Solution:
    def maxFreqSum(self, s: str) -> int:

        f = {}
        ch = list(s)
        for x in ch:
            if x in f:
                f[x] += 1
            else:
                f[x] = 1
        
        mv = 0
        mc =0
        for c in f:
            if c in "aeiou":
                if f[c] > mv:
                    mv = f[c]
            else:
                if f[c]> mc:
                    mc = f[c]
        return mv+mc
            


        
        
        