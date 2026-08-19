class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int s=0,e=n-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            //no. of +ve integers missing before mid= arr[mid]-(mid+1)
            if(arr[mid]-(mid+1)<k){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        //missing nos. before end index=     arr[e]-e-1
        //remaining missing nos. for k =     k-(arr[e]-e-1)
        //kth missing no.=      arr[e]+remaining missing no.
        //               =      k+(e+1)
        //               =      k+s
        return s+k;
    }
}