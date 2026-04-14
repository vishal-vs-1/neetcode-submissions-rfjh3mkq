class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] A = nums1;
        int[] B = nums2;
        int total = A.length + B.length;
        int half = total / 2;

        // Ensure A is the smaller array
        if (B.length < A.length) {
            int[] temp = A;
            A = B;
            B = temp;
        }

        int l = 0;
        int r = A.length - 1;

        while (true) {
            // In Java, use Math.floorDiv for negative results, 
            // but since we handle i < 0 manually, standard division is fine here.
            int i = Math.floorDiv(l + r, 2); 
            int j = half - i - 2;

            int Aleft = (i >= 0) ? A[i] : Integer.MIN_VALUE;
            int Aright = (i + 1 < A.length) ? A[i + 1] : Integer.MAX_VALUE;
            int Bleft = (j >= 0) ? B[j] : Integer.MIN_VALUE;
            int Bright = (j + 1 < B.length) ? B[j + 1] : Integer.MAX_VALUE;

            // Partition is correct
            if (Aleft <= Bright && Bleft <= Aright) {
                // Odd total
                if (total % 2 != 0) {
                    return Math.min(Aright, Bright);
                }
                // Even total
                return (Math.max(Aleft, Bleft) + Math.min(Aright, Bright)) / 2.0;
            } 
            else if (Aleft > Bright) {
                r = i - 1;
            } 
            else {
                l = i + 1;
            }
        }
    }
}
