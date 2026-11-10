class Solution {
    public long subArrayRanges(int[] nums) {
        
        long sum=0;
         int n = nums.length;

        for(int i=0;i<n;i++){
            int lg=nums[i];
            int sg=nums[i];
            for(int j=i;j<n;j++){

                lg=Math.max(lg,nums[j]);
                sg=Math.min(sg,nums[j]);

                sum+=(lg-sg);
            }
        }
        return sum ;
    }
}