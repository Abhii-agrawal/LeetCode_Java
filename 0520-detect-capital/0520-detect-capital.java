class Solution {
    public boolean detectCapitalUse(String word) {
        

        String cap = word.toUpperCase();
        String low = word.toLowerCase();
        String first = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();

        if(word.equals(cap)|| word.equals(low)|| word.equals(first)) return true;

        return false ;
    }
}