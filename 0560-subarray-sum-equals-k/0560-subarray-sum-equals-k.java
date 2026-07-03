class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> map=new HashMap<>();
        map.put(0,1);

        int count=0;
        int currsum=0;
        for(int i:nums){
            currsum+=i;
            if(map.containsKey(currsum-k)){
                count+=map.get(currsum-k);
            }
                map.put(currsum,map.getOrDefault(currsum,0)+1);
            
        }
        return count;
    }
}