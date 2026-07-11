class Solution {


    public int pivot(int[] nums){
        int piv=-1;
        int n=nums.length;
        int s=0,e=n-1;
        if(nums[s]<nums[e]){
            return -1;
        }
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<=nums[n-1]){
                e=mid-1;
            }
            else{
                piv=mid;
                s=mid+1;
            }
        }
        return piv;
    }
    public int binarysearch(int[] nums, int s, int e, int target){
        while(s<=e){
            int mid=s+(e-s)/2;
            if(nums[mid]<target){
                s=mid+1;
            }
            else if(nums[mid]>target){
                e=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        int sl1=0;
        int el1=pivot(nums);
        int sl2=pivot(nums)+1;
        int el2=n-1;
        int ans=-1;
        if(pivot(nums)==-1){
            return binarysearch(nums,0,n-1,target);
        }
        if(target >= nums[sl2] && target <= nums[el2]){
            ans=binarysearch(nums,sl2,el2,target);
        }
        if(target>=nums[sl1] && target<=nums[el1]){
            ans=binarysearch(nums,sl1,el1,target);
        }
        return ans;
    }
}