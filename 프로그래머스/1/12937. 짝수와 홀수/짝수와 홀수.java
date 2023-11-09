class Solution {
    public String solution(int num) {
        int result = num % 2;
        return result == 1 || result == -1 ?"Odd":"Even";
    }
}