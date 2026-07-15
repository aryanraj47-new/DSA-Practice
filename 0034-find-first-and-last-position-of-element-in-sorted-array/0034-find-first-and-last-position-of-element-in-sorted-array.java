class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range={-1,-1};
        
        int s=binarysearch(nums,target,true);
        int e=binarysearch(nums,target,false);
        range[0]=s;
        range[1]=e;
        return range;
        
    }
    public int binarysearch(int[] nums, int target,boolean searchleft){
        int n=nums.length;
        int s=0,e=n-1,i=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]>target) e=mid-1;
            else if(nums[mid]<target) s=mid+1;
            else{
                i=mid;
                if(searchleft){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return i;
    }
}