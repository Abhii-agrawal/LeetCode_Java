class Solution {
    public int numOfSubarrays(int[] arr) {
          

          int M = 1000000007;

        int n = arr.length;
        int[] prefix = new int[arr.length];
 
        prefix[0]=arr[0];
        
        for(int i=1;i<n;i++){
        prefix[i]=prefix[i-1]+arr[i];
    }
    int oddC=0;
    int evenC=1;
    int count=0;

    for(int i=0;i<prefix.length;i++){
        if(prefix[i]%2==0){
            count= (count+oddC)%M;
            evenC++;
        } else {
            count=(count+evenC)%M;
            oddC++;
        }
    }
    return (int) count ;
}
}