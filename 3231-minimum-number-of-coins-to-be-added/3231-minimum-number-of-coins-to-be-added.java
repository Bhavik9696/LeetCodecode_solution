class Solution {
    public int minimumAddedCoins(int[] coins, int target) {
        Arrays.sort(coins);
        int added=0;
        long miss=1;
        int i=0;
        while(miss<=target){
            if(i<coins.length && coins[i]<=miss){
                miss+=coins[i];
                i++;
            }else{
                miss+=miss;
                added++;
            }
        }
        return added;
    }
}