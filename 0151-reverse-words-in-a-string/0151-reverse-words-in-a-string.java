class Solution {
    public String reverseWords(String s) {
        
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        
        
        int e = s.length() - 1; 
        
        for (int i = s.length() - 1; i >= 0; i--) {
            
            if (s.charAt(i) == ' ') {
                if (e > i) { 
                    
                    sb.append(s, i + 1, e + 1);
                    sb.append(' ');
                }
                
                e = i - 1; 
            } 
            
            else if (i == 0) {
                sb.append(s, i, e + 1);
            }
        }
        
        
        return sb.toString().trim();
    }
}