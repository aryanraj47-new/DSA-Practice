import java.util.Arrays;

class Solution {
    static boolean isvalid(int h, int[] piles, int mid) {
        long ht = 0; 
        
        for (int i = 0; i < piles.length; i++) {
            if(piles[i]<=mid)    ht++;
            else if(piles[i]>mid){
                if(piles[i]%mid==0) ht+=(piles[i]/mid);
                else    ht+=(piles[i]/mid)+1;
            }   
        }
        
        return ht <= h;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        Arrays.sort(piles);
        
        int s = 1;
        int e = piles[n - 1]; 
        int ans = e;
        
        while (s <= e) {
            int mid = s + (e - s) / 2;
            
            if (isvalid(h, piles, mid)) {
                ans = mid;
                e = mid - 1; 
            } else {
                s = mid + 1; 
            }
        }
        
        return ans;
    }
}