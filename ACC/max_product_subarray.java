class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0],min=nums[0],maxProduct=nums[0];
        int temp;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                max = Math.max(nums[i],max*nums[i]);
                min = Math.min(nums[i],min*nums[i]);
            }
            else if(nums[i]==0)
            {
                max=0;
                min = 0;
            }
            else{
                temp=max;
                max = Math.max(nums[i],nums[i]*min);
                min = Math.min(nums[i],nums[i]*temp);
            }
            maxProduct=Math.max(max,maxProduct);
        }
      return maxProduct;
    }
}
