class Solution:
    def convertTemperature(self, celsius: float) -> List[float]:
        l = []
        res = celsius + 273.15
        res1 = celsius * 1.80 + 32.00
        l.append(res)
        l.append( res1)
        return l

        