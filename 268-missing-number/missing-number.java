class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int n=nums.length;
        int asum=n*(n+1)/2;


        for(int ss:nums){
            sum+=ss;
        }
        return asum-sum;
    }
}