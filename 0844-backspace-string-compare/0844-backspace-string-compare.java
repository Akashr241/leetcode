class Solution {
    private String check(String str) {
        StringBuilder result = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (ch != '#') {
                result.append(ch);
            } else if (result.length() > 0) {
                result.deleteCharAt(result.length() - 1);
            }
        }
        return result.toString();
    }
    public boolean backspaceCompare(String s, String t) {
        return check(s).equals(check(t));
    }
}