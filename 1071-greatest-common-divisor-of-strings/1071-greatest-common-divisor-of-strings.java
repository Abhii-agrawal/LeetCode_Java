class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        if(!(str1+str2).equals(str2+str1) ) return "";

        int gcdL=gcd(str1.length() , str2.length());

          return str1.substring(0,gcdL);

       
    }
     private int gcd(int a , int b){
            int lim=Math.min(a,b);

            for(int i=lim;i>=1;i--){
                if(a%i==0 && b%i==0) return i;
            }
            return 1;
     }
    
}
