from typing import List


def merge(nums1: List[int], m: int, nums2: List[int], n: int) -> None:
    nums1_ptr = len(nums1) - 1
    while m > 0 and n > 0:
        if nums2[n - 1] > nums1[m - 1]:
            nums1[nums1_ptr] = nums2[n - 1]
            n -= 1
        else:
            nums1[nums1_ptr] = nums1[m - 1]
            m -= 1
        nums1_ptr -= 1

    while n > 0:
        nums1[nums1_ptr] = nums2[n - 1]
        n -= 1
        nums1_ptr -= 1

nums1 = [1, 2, 3, 0, 0, 0]
m = 3
nums2 = [2, 5, 6]
n = 3

merge(nums1, m , nums2, n)
print(nums1)
