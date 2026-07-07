class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));

        List<int[]> range=new ArrayList<>();
        int[] prev=intervals[0];
        for(int i=0;i<intervals.length;i++){
            if(intervals[i][0]<=prev[1]){
                prev[1]=Math.max(prev[1],intervals[i][1]);
            }
            else{
                range.add(prev);
                prev=intervals[i];
            }
        }
        range.add(prev);
        return range.toArray(new int[range.size()][2]);
    }
}