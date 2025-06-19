class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    List<Integer> ans = new ArrayList<>();
        int i=0;
        while(i<nums.length){
            int correctindex=nums[i]-1;
            if(nums[i]!=nums[correctindex]){
                int temp=nums[i];
                nums[i]=nums[correctindex];
                nums[correctindex]=temp;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<nums.length;j++){
            if(j!=nums[j]-1){
               ans.add(nums[j]);
            }
        }
        return ans;
    }
} 