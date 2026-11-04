class Solution {
    public int[] asteroidCollision(int[] aster) {

        List<Integer> al = new ArrayList<>();

        for(int x : aster){
            al.add(x);
        }

        int i=0;

        while(i<al.size()-1){

            int a = al.get(i);
            int b = al.get(i+1);

            if(a>0 && b<0){

                if(Math.abs(a)>Math.abs(b)){
                    al.remove(i+1);
                }
                else if(Math.abs(a)<Math.abs(b)){
                    al.remove(i);
                    if(i>0) i--;
                } else {
                    al.remove(i+1);
                    al.remove(i);
                    if(i>0) i--;
                }
            } else {
                i++;
            }
        }
        int[] ans = new int[al.size()];
        
        for(int k=0;k<ans.length;k++){
            ans[k]=al.get(k);
        }
        return ans ;
    }
}