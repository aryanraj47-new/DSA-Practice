class Solution {
    public int minimumSwaps(int[] nums) {
        int c=0,j=nums.length-1,s=nums.length-1;
        for(int i=0;i<nums.length;i++){
            for(j=s;j>i;j--){
                if(nums[j]==0){
                    s--;
                }
                else{
                    break;
                }
            }
            
            if(nums[i]==0 && s>i){
                nums[i]=nums[j];
                nums[j]=0;
                c++;
                s--;
            }
            
        }
        return c;
    }
}