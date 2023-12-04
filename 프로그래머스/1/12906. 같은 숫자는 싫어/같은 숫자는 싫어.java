import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> result = new LinkedList<>();
        int before = -1;
        for(int a: arr) {
            if(before == a) {
                continue;
            }
            before = a;
            result.add(a);
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}