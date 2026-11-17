class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {


        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<tickets.length;i++){
            q.add(i);
        }
        
        int time=0;
        while(!q.isEmpty()){
            
            int p = q.poll();
            tickets[p]--;
            time++;

            if(p==k && tickets[p]==0){
                break;
            }
            if(tickets[p]>0){
                q.add(p);
            }
        }
        return time;
        
    }
}