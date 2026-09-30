class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int max = n*(n+1)/2;
        for(int i : nums){
            max -= i;
        }
        return max;
    }
}