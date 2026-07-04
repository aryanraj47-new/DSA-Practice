import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = generateRowUsingNCr(i);
            triangle.add(row);
        }
        
        return triangle;
    }

    
    public List<Integer> generateRowUsingNCr(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        long val = 1; 
        
        for (int r = 0; r <= rowIndex; r++) {
            row.add((int) val);
            
            
            val = val * (rowIndex - r) / (r + 1);
        }
        
        return row;
    }
}