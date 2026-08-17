class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n=nums.length;
        Arrays.sort(nums);
        int s=1,e=nums[n-1],ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(isvalid(nums,threshold,mid)){
                ans=mid;
                e=mid-1;
            }
            else    s=mid+1;
        }
        return ans;
        
    }
    static boolean isvalid(int[] nums,int threshold,int mid){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%mid==0){
                sum+=(int)(nums[i]/mid);
            }
            else    sum+=(int)((nums[i]/mid)+1);
        }
        if(sum<=threshold)  return true;
        else    return false;
    }
}