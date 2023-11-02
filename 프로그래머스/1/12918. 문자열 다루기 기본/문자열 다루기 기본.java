class Solution {
    public boolean solution(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        var length = s.length();
        return length == 4 || length == 6;
    }
}