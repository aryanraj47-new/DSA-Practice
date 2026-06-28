class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i:a){
            ts.add(i);
        }
        for(int i:b){
            ts.add(i);
        }
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i:ts){
            arr.add(i);
        }
        return arr;
    }
}
