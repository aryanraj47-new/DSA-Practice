class Solution {
    int missingNum(int arr[]) {
        // code here
        int i=0;
        int[] nums=new int[arr.length];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int j:arr){
            pq.offer(j);
        }
        for(int j=0;j<nums.length;j++){
            nums[j]=pq.poll();
        }
        for(i=0;i<nums.length;i++){
            if(i+1!=nums[i]){
                return i+1;
            }
            
        }
        return i+1;
    }
}