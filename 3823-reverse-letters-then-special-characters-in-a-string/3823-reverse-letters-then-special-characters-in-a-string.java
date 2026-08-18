class Solution {
    public String reverseByType(String s) {
        Stack<Character> a = new Stack<>();
        Stack<Character> b = new Stack<>();

        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                a.push(ch);
            } else {
                b.push(ch);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isLetter(ch)){
                sb.append(a.pop());
            } else {
                sb.append(b.pop());
            }
        }

        return sb.toString();
    }
}