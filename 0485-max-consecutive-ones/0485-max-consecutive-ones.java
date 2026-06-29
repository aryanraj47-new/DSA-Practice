class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0,maxc=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }
            if(nums[i]!=1){
                count=0;
            }
            if(maxc<count){
                maxc=count;
            }
        }
        return maxc;
        
    }
}