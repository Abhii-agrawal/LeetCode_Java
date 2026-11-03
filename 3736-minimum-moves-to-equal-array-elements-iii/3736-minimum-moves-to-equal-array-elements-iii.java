class Solution {
    public int minMoves(int[] nums) {
        
        int maxx=0;
        for(int n : nums ){
            maxx=Math.max(n,maxx);
        }
        int count=0;
        int len = nums.length;

        for(int i=0;i<len;i++){

            while(nums[i]!=maxx){
                nums[i]++;
                count++;
            }
        }

        return count;
    }
}