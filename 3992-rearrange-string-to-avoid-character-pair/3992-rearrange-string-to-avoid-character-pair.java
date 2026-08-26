class Solution {
    public String rearrangeString(String s, char x, char y) {
        int cntx = 0, cnty =0 ; 
        StringBuilder str = new StringBuilder(); 
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            if(c != x && c != y) str.append(c); 
            if(c == x) cntx++; 
            if(c == y) cnty++; 
        }
        StringBuilder ans = new StringBuilder(); 
        for(int i = 0; i < cnty; i++) ans.append(y); 
        ans.append(str); 
        for(int i= 0; i < cntx; i++) ans.append(x); 
        return String.valueOf(ans); 
    }
}