    class Solution {
    public int findMin(int[] nums) {
        int i=0, j=nums.length-1;
        while(i<j) {
            if (nums[i]>nums[i+1]) return nums[i+1];
            if (nums[j]<nums[j-1]) return nums[j];
            ++i; --j;
        }
        return nums[0];
    }
}