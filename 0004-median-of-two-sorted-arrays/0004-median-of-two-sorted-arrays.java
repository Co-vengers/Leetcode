class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int total = nums1.length + nums2.length;
        int[] a = new int[(total / 2) + 1];
        int l = 0, r = 0;

        for (int i = 0; i <= total / 2; i++) {
            if (l < nums1.length && (r >= nums2.length || nums1[l] <= nums2[r])) {
                a[i] = nums1[l++];
            } else {
                a[i] = nums2[r++];
            }
        }

        if (total % 2 == 0) {
            return (a[total / 2] + a[total / 2 - 1]) / 2.0;
        } else {
            return a[total / 2];
        }
    }
}