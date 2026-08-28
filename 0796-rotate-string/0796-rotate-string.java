class Solution {
    public boolean rotateString(String s, String goal) {
        String fh="",sh="",st="";
        for(int i=0;i<s.length();i++){
            fh=s.substring(0,i);
            sh=s.substring(i,s.length());
            st=sh+fh;
            if(st.equals(goal)){
                return true;
            }
        }
        
        return false;
    }
}