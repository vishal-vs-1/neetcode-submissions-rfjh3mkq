class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if(len2 > len1){
            return findMedianSortedArrays(nums2, nums1);
        }
        int totalLen = len1+len2;
        int partition = (totalLen+1)/2;
        int l = 0, r = len2;
        boolean even = totalLen%2 == 0; 
        while(true){
            int midPartition = (l+r)/2;
            int leftPart = midPartition == 0 ? Integer.MIN_VALUE : nums2[midPartition-1];
            int rightPart = midPartition == len2 ? Integer.MAX_VALUE : nums2[midPartition];
            int nums1Partition = partition - midPartition;
            int leftPart1 = nums1Partition == 0 ? Integer.MIN_VALUE : nums1[nums1Partition-1];
            int rightPart1 = nums1Partition == len1 ? Integer.MAX_VALUE : nums1[nums1Partition];

            if(leftPart <= rightPart1 && leftPart1 <= rightPart){
                return even ? (Math.max(leftPart, leftPart1) + Math.min(rightPart, rightPart1))/2.0 
                            : Math.max(leftPart, leftPart1);
            } else if(leftPart > rightPart1){
                r= midPartition-1;
            } else{
                l = midPartition+1;
            }
            
        }
    }
}
