class Solution {
    public int singleNumber(int[] nums) {
        int e=0;
        for(int i=0;i<nums.length;i++){
            e=e^nums[i];

        }
        return e;
        
    }
}