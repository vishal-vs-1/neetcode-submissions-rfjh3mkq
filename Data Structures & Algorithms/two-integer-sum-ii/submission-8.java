class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int s = 0, e = numbers.length -1;
        while(s<e){
            while(s<e && numbers[s] + numbers[e] > target)
                e--;
            while(s<e && numbers[s] + numbers[e] < target)
                s++;
            if(numbers[s] + numbers[e] == target){
                return new int[]{s+1, e + 1};
            }
        }
        return new int[]{0,0};
    }
}
