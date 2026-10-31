class Solution {
    public int countBalls(int lm, int hm) {

        int[] freq = new int[50];

        for(int i=lm;i<=hm;i++){
            int sum=0;
            int num=i;
            while(num>0){
                sum+=num%10;
                num=num/10;
            }
            freq[sum]++;
        }
      int maxx=0;

      for(int c : freq){
        maxx=Math.max(c,maxx);
      }
        
        return maxx;
        
    }
}