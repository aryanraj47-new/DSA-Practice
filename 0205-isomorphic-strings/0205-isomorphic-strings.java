class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> m=new HashMap<>();
        if(s.length()!=t.length())  return false;
        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i))){
                if(m.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }
            else{
                if(m.containsValue(t.charAt(i)) && !m.containsKey(s.charAt(i))) return false;
                m.put(s.charAt(i),t.charAt(i));
            }
            
        }
        return true;
    }
}