import java.lang.Math;

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        while (n >= a) {
            int newCoke = (int) Math.floor(n / a);
            answer += newCoke * b;
            n = n + newCoke * (b - a);
        }
        return answer;
    }
}