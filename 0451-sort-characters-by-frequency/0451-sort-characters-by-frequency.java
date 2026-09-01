class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> um=new HashMap<>();
        for(int i=0;i<s.length();i++){
            um.put(s.charAt(i), um.getOrDefault(s.charAt(i), 0) + 1);
        }

        ArrayList<Map.Entry<Character,Integer>> list=new ArrayList<>(um.entrySet());
        list.sort((a,b)->b.getValue().compareTo(a.getValue()));

        
        String st="";
        for(Map.Entry<Character,Integer> entry:list){
            char key=entry.getKey();
            int value=entry.getValue();
            st=st+("" + key).repeat(value);
        }
        return st;
    }
}