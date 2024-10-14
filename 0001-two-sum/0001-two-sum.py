class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for index, num in enumerate(nums):
            result = list(
                map(
                    (lambda x: x[1] + num if index != x[0] else "k"),
                    enumerate(nums),
                )
            )

            if target in result:
                firstNumIndex = nums.index(num)
                secondNumIndex = result.index(target)
                return [firstNumIndex, secondNumIndex]
                break
