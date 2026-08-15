class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<(long)m*k)   return -1;
        int s=0,e=Integer.MAX_VALUE;
        while(s<e){
            int mid=s+(e-s)/2;
            if(isvalid(bloomDay,m,k,mid)){
                e=mid;
            }
            else{
                s=mid+1;
            }
        }
        return s;
        
    }
    static boolean isvalid(int[] bloomDay,int m, int k, int mid){
        int bouqet=0,adjf=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=mid){
                adjf++;
                if(adjf==k){
                    bouqet++;
                    adjf=0;
                }
                else{
                    continue;
                }
            }
            else    adjf=0;
            if(bouqet>=m)   return true;
        }
        return bouqet>=m;
    }
}