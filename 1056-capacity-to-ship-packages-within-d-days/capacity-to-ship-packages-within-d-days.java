class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int max=0,total=0;
        for(int i=0;i<n;i++){
            total+=weights[i];
            if(max<weights[i])  max=weights[i];
        }
        int s=max,e=total,ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isvalid(weights,days,mid)){
                ans=mid;
                e=mid-1;
            }
            else    s=mid+1;
        }
        return ans;
        
    }
    private static boolean isvalid(int[] weights, int days, int capacity) {
        int daysNeeded = 1;
        int currentWeight = 0;
        
        for (int w : weights) {
            if (currentWeight + w > capacity) {
                daysNeeded++;
                currentWeight = 0;
            }
            currentWeight += w;
        }
        
        return daysNeeded <= days;
    }
}