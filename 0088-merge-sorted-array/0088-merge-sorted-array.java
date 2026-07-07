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
        Arrays.sort(nums1);
        return;
        
    }
}