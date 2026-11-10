class Solution {
    public String removeKdigits(String num, int k) {


        StringBuilder sb = new StringBuilder();
          int n = num.length();

        for(int i=0;i<n;i++){
             char ch = num.charAt(i);
             while(sb.length()>0 && k>0 && sb.charAt(sb.length()-1)>ch){
                sb.deleteCharAt(sb.length()-1);
                k--;
             }
             sb.append(ch);
            }

            while(sb.length()>0 && k>0){
                sb.deleteCharAt(sb.length()-1);
                k--;
            }

            int i=0;

            while(i<sb.length() && sb.charAt(i)=='0') i++;

            if(i==sb.length()) return "0";

            return sb.substring(i);
        
    }
}