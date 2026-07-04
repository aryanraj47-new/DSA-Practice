class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> maj=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(maj.containsKey(nums[i])){
                maj.put(nums[i],maj.get(nums[i])+1);
            }
            else{
                maj.put(nums[i],1);
            }
        }
        int n=nums.length;
        List<Integer> ele=new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry:maj.entrySet()){
            if(entry.getValue()>n/3){
                ele.add(entry.getKey());
            }
        }
        return ele;
        
    }
}