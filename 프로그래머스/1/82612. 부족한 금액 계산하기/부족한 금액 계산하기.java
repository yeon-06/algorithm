class Solution {
    public long solution(int price, int money, int count) {
        long answer = (long) price * count * (count + 1) / 2 - money;
        return answer > 0 ? answer : 0;
    }
}