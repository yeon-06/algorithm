class Solution {
    public int[] solution(long n) {
        int length = String.valueOf(n).length();
        int[] arr = new int[length];
        int index = 0;
        while (n > 0) {
            arr[index++] = (int) (n % 10);
            n /= 10;
        }
        return arr;
    }
}