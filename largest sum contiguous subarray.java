class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length==0)
            return 0;
        int max_sum=nums[0], current_sum=max_sum;
        for(int i=1;i<nums.length;i++)
        {
            current_sum= current_sum+nums[i]>nums[i]? current_sum+nums[i]:nums[i] ;
            max_sum= current_sum>max_sum? current_sum: max_sum;
        }
        return max_sum;
    }
}
