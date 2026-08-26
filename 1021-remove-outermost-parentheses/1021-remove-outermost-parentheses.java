class Solution {
    public String removeOuterParentheses(String s) {
        int c=0,st=0,l=0;
        String s1="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '('){
                c++;
                if(c==1){
                    st=i+1;
                }
            }
            else if(s.charAt(i) == ')'){
                    c--;
                    if(c==0){
                        l=i;
                    }
            }
            
            if(c==0){
                s1=s1+s.substring(st,l);
            }
        }
        return s1;
        
    }
}