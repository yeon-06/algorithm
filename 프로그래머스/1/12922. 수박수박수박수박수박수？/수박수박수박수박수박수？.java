class Solution {
    public String solution(int n) {
        if(n%2==1) {
            return "수박".repeat(n/2) + "수";
        }
        return "수박".repeat(n/2);
    }
}