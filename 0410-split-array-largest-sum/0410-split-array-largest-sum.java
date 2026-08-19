class Solution {
    public int splitArray(int[] nums, int k) {
       int n=nums.length;
       int s=Integer.MIN_VALUE;
       int e=0;
       if(n<k)  return -1;
       for(int i=0;i<n;i++){
        s=Math.max(s,nums[i]);
        e+=nums[i];
       }
       int ans=0;
       while(s<=e){
        int mid=s+(e-s)/2;
        if(isvalid(nums,mid,k)){
            ans=mid;
            e=mid-1;
        }
        else    s=mid+1;
       }
       return ans;
    }
    static boolean isvalid(int[] nums, int mid,int k){
        int c=1,sum=0;
        for(int i=0;i<nums.length;i++){
            if((sum+nums[i])>mid){
                c++;
                sum=nums[i];
            }
            else    sum+=nums[i];
        }
        return c<=k;
    }
}
//intution: count the no of arrays u can make for mid