package solutions;

public class _4_MedianOfTwoSortedArrays {

    public static void main(String[] args) {

        System.out.println(new _4_MedianOfTwoSortedArrays().findMedianSortedArrays(new int[] {}, new int[] {2, 3, 7, 10, 12, 15}));
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums2 == null || nums2.length == 0) {
            int middle = nums1.length / 2;
            return (nums1.length%2 == 0) ?
                    (nums1[middle - 1] + nums1[middle]) / 2.0 : (double) nums1[middle];
        }

        if (nums1 == null || nums1.length == 0) {
            int middle = nums2.length / 2;
            return (nums2.length%2 == 0) ?
                    (nums2[middle - 1] + nums2[middle]) / 2.0 : (double) nums2[middle];
        }

        int[] allElements = new int[nums1.length + nums2.length];

        int halfLength = allElements.length / 2;
        int i = 0, j= 0, index = 0;

        while (i < nums1.length && j < nums2.length) {

            if (nums1[i] == nums2[j]) {
                allElements[index++] = nums1[i++];
                allElements[index++] = nums2[j++];
            } else if (nums1[i] < nums2[j])
                allElements[index++] = nums1[i++];
            else
                allElements[index++] = nums2[j++];
        }

        while (i < nums1.length) {
           allElements[index++] = nums1[i++];
        }

        while (j < nums2.length) {
            allElements[index++] = nums2[j++];
        }

        return (allElements.length%2 == 0) ?
                (allElements[halfLength - 1] + allElements[halfLength]) / 2.0 : (double) allElements[halfLength];
    }
}
