package array.leetcode88;

public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int temp = m + n - 1;
        while(n > 0 && m > 0)
            nums1[temp --] = nums1[m-1] > nums2[n-1] ? nums1[--m]:nums2[--n];
        while(m > 0)
            nums1[temp --] = nums2[--m];
    }
}
