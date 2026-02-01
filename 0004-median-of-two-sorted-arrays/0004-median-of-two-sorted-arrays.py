class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        merge = sorted (nums1 + nums2)
        n= len(merge)
        if (n % 2) == 0:
            median =( ( merge [n // 2 ] ) + (merge[n // 2 - 1] ) )/ 2.0
        else :
            median = ( merge [n // 2])
        return median       