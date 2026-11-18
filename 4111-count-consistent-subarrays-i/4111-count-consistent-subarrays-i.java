class Solution {
    public int countConsistent(int[] nums) {
        
        int c=0;
        for(int i=0;i<nums.length;i++){
            int min=nums[i];
            int andV=nums[i];
            for(int j=i;j<nums.length;j++){
                min=Math.min(min,nums[j]);
                andV=andV & nums[j];
                         
                if(min==andV) c++;

            }
        }
        return c;
    }
}