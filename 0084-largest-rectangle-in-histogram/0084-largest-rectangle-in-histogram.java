class Solution {
    public int largestRectangleArea(int[] ht) {
         
         int n = ht.length;
     int[] pse = new int[n];
     int[] nse = new int[n];
     Stack<Integer> st = new Stack<>();

     for(int i=0;i<n;i++){

        while(!st.isEmpty() && ht[st.peek()]>=ht[i]){
            st.pop();
        }
        if(st.isEmpty()){
            pse[i]=-1;
        } else {
            pse[i]=st.peek();
        }
        st.push(i);
     }

     st.clear();

     for(int i=n-1;i>=0;i--){

         while(!st.isEmpty() && ht[st.peek()]>=ht[i]){
            st.pop();
        }
        if(st.isEmpty()){
            nse[i]=n;
        } else {
            nse[i]=st.peek();
        }
        st.push(i);
     }

     int maxA=0;

     for(int i=0;i<n;i++){
        int w = nse[i]-pse[i]-1;
        int area = ht[i]*w;
        maxA=Math.max(area,maxA);
     }


     return maxA;

     


    }
}