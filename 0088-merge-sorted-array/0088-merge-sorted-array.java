class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0;
        while(j<n){
            if(nums1[i]==0){
                nums1[i]=nums2[j];
                j++;
            }
            i++;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int k:nums1){
            pq.offer(k);
        }
        for(int k=0;k<nums1.length;k++){
            nums1[k]=pq.poll();
        }
        return;
        
    }
}