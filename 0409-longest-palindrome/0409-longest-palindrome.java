class Solution {
    public int longestPalindrome(String s) {

        int[]  freq = new int[128];

        for(int i=0;i<s.length();i++){
                freq[s.charAt(i)]++;
        }
        
        int ans=0;
         boolean isOdd=false;
        for(int c : freq){
            ans=ans+(c/2)*2;
    
            if(c%2==1) isOdd=true;
        }
        if(isOdd) ans+=1;


        return ans;
    }
}