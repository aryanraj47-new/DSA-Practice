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
    public int findMin(int[] nums) {
        int piv=pivot(nums);
        return nums[piv+1];
    }
}