class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> p=new ArrayList<>();
        ArrayList<Integer> n=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                n.add(nums[i]);
            }
            else{
                p.add(nums[i]);
            }
        }
        for(int i=0;i<nums.length-1;i+=2){
            nums[i]=p.get(i/2);
        }
        for(int i=1;i<nums.length;i+=2){
            nums[i]=n.get((i-1)/2);
        }
        return nums;
    }
}