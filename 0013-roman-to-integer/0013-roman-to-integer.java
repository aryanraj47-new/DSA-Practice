class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> sym1=new HashMap<>(); 
        sym1.put('I',1);
        sym1.put('V',5);
        sym1.put('X',10);
        sym1.put('L',50);
        sym1.put('C',100);
        sym1.put('D',500);
        sym1.put('M',1000);
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(i>=0 && i<s.length()-1 && s.charAt(i+1)=='V' && s.charAt(i)=='I'){
                sum=sum+4;
                i++;
            }
            else if(i>=0 && i<s.length()-1 && s.charAt(i+1)=='X' && s.charAt(i)=='I'){
                sum=sum+9;
                i++;
            }
            else if(i>=0 && i<s.length()-1 && s.charAt(i+1)=='L' && s.charAt(i)=='X'){
                sum=sum+40;
                i++;
            }
            else if(i>=0 && i<s.length()-1 && s.charAt(i+1)=='C' && s.charAt(i)=='X'){
                sum=sum+90;
                i++;
            }
            else if(i>=0 && i<s.length()-1 && s.charAt(i+1)=='D' && s.charAt(i)=='C'){
                sum=sum+400;
                i++;
            }
            else if(i>=0 && i<s.length()-1 && s.charAt(i+1)=='M' && s.charAt(i)=='C'){
                sum=sum+900;
                i++;
            }
            else{
                sum+=sym1.get(s.charAt(i));
            }
            

        }
        return sum;
    }
}