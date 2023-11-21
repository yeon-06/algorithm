class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int size = absolutes.length;
        int result = 0;
        
        for(int i=0;i<size;i++) {
            result += signs[i] ? absolutes[i] : absolutes[i] * -1;
        }
        return result;
    }
}