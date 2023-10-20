import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int[] numlist, int n) {
        return Arrays.stream(numlist)
            .boxed()
            .sorted(((o1, o2) -> {
                int abs1 = Math.abs(o1 - n);
                int abs2 = Math.abs(o2 - n);
                if (abs1 == abs2) {
                    return o2 - o1;
                } else {
                    return abs1 - abs2;
                }
            }))
            .mapToInt(Integer::intValue)
            .toArray();
    }
}