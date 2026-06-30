class Solution:
    def numberOfSubstrings(self, s: str) -> int:

        c=0
        l=0
        r =0
        w = {'a':0, 'b':0, 'c':0}
        for r in range(len(s)):
            w[s[r]] += 1
           
            while w['a'] > 0  and w['b']>0  and w['c']>0:
                
                w[s[l]] -=1
                c+= len(s)-r
                l += 1
        return c

        