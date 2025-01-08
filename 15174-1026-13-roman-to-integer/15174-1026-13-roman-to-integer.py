class Solution:
    def romanToInt(self, s: str) -> int:
        romanDict = {"I": 1, "V": 5, "X": 10, "L": 50, "C": 100, "D": 500, "M": 1000}

        num = 0
        for i in range(len(s)):
            currentChar = s[i]
            try:
                nextChar = s[i + 1]
            except IndexError:
                nextChar = None

            if i == 0:
                prevChar = None
            else:
                prevChar = s[i - 1]

            if nextChar and (romanDict[currentChar] < romanDict[nextChar]):
                if prevChar and (romanDict[currentChar] > romanDict[prevChar]):
                    continue
                num = num + (romanDict[nextChar] - romanDict[currentChar])
            else:
                if prevChar and (romanDict[currentChar] > romanDict[prevChar]):
                    continue
                num = num + romanDict[currentChar]

        return num
