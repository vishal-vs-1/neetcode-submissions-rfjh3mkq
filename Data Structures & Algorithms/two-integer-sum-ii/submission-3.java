class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start =0;
        int end = numbers.length-1;
        while(start<end){
            int a = numbers[start];
            int b = numbers[end];
            if(a+b == target)
                return new int[]{start+1,end+1};
            else if(a+b > target)
                end--;
            else start++;
        }
        return new int[]{0,0};
    }
}
