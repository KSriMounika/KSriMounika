class Solution:
    def recoverOrder(self, order: List[int], friends: List[int]) -> List[int]:

        l = []
        for i in range (len(order)):
            for j in range(len(friends)):
                if order[i] == friends[j]:
                    l.append(order[i])
        return l
        