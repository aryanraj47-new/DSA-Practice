class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int c1=0,e1=0,c2=0,e2=0,n=0;
        n=nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==e1) c1++;
            else if(nums[i]==e2) c2++;
            else if(c1==0){
                e1=nums[i];
                c1++;
            }
            else if(c2==0){
                e2=nums[i];
                c2++;
            }
            else{
                c1--;
                c2--;
            }
        }
        c1=0;
        c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==e1){
                c1++;
            }
            if(nums[i]==e2){
                c2++;
            }
        }
        Set<Integer> arr=new LinkedHashSet<>();
        if(c1>n/3){
            arr.add(e1);
        }
        if(c2>n/3){
            arr.add(e2);
        }
        List<Integer> maj=new ArrayList<>(arr);
        return maj;
    }
}