class Solution {
    public int[] asteroidCollision(int[] aster) {

     Stack<Integer> st = new Stack<>();
       int n = aster.length;

     for(int i=0;i<n;i++){
         int a=aster[i];

         while(! st.isEmpty() && a<0 && st.peek()>0 && st.peek()<-a){
            st.pop();
         } 
         if(! st.isEmpty() && a<0 && st.peek()>0){
            if(st.peek()== -a) st.pop();
         }else {
            st.push(a);
         }
     }
     int[] ans = new int[st.size()];

     for(int i=st.size()-1;i>=0;i--){
        ans[i]=st.pop();
     } 
     return ans;  
    }
}