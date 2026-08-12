class Solution {
    public String reverseWords(String s) {
        String [] words=s.split(" ");
        StringBuilder result=new StringBuilder();

        for(String word: words){
            StringBuilder reverseword=new StringBuilder(word).reverse();
            result.append(reverseword).append(" ");
        }
        result.deleteCharAt(result.length()-1);


        return result.toString();
    }
}