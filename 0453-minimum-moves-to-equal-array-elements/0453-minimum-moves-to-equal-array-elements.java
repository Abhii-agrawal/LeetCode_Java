class Solution {
    public int minMoves(int[] nums) {

       int sum=0;
       int n = nums.length;
       int minn=nums[0];

       for(int i=0;i<nums.length;i++){
       sum+=nums[i];
       minn=Math.min(nums[i],minn);
    }

      return sum-(n*minn);
    }

  
}