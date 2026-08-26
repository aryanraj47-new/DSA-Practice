class Solution {
    public String reverseWords(String s) {
        
        s = s.trim(); 
        StringBuilder sb = new StringBuilder();
        
        
        int e = s.length() - 1; 
        
        while (e >= 0) {
            
            if (s.charAt(e) == ' ') {
                e--;
                continue;
            }
            
            
            int st = e;
            while (st >= 0 && s.charAt(st) != ' ') {
                st--;
            }
            
            
            sb.append(s, st + 1, e + 1);
            sb.append(' '); 
            e = st;
        }
        
        
        return sb.toString().trim();
    }
}