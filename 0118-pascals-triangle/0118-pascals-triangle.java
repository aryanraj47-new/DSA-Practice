class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> arr = new ArrayList<>();
        
        
        if (numRows == 0) return arr;
        
        
        arr.add(new ArrayList<>(List.of(1)));
        if (numRows == 1) return arr;
        
        
        arr.add(new ArrayList<>(List.of(1, 1)));
        
        
        for (int i = 2; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            
            
            row.add(1); 
            
            
            for (int j = 1; j < i; j++) {
                row.add(arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j));
            }
            
            
            row.add(1); 
            
            arr.add(row);
        }
        return arr;
    }
}