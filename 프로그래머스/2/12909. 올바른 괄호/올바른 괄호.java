class Solution {
    boolean solution(String s) {
        int length = s.length();
        int startCnt = 0;
        int endCnt = 0;
        for (int i=0;i<length;i++) {
            if (s.charAt(i) == '(') {
                startCnt++;
            } else {
                endCnt++;
            }
            if(endCnt > startCnt) {
                return false;
            }
        }
        return startCnt == endCnt;
    }
}