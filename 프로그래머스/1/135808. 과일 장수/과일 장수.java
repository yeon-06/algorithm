import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        Arrays.sort(score);

        int length = score.length;
        int answer = 0;

        for (int i = length % m; i < length; i += m) {
            answer += score[i] * m;
        }
        return answer;
    }
}