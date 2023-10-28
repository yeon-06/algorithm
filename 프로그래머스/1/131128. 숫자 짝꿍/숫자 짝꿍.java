import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public String solution(String X, String Y) {
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        
        for(char xc : X.toCharArray()) {
            xArr[xc-'0']++;
        }
        
        for(char yc : Y.toCharArray()) {
            yArr[yc-'0']++;
        }
        
        // 공통으로 나타나는 정수 추출
        List<Integer> result = new LinkedList<>();
        for(int i = 9; i>=0; i--) {
            int min = Math.min(xArr[i], yArr[i]);
            for(int j = 0;j<min;j++) {
                result.add(i);
            }
        }
        
        // 공통 정수 없으면 -1 반환
        if(result.size() == 0) {
            return "-1";
        }
        
        // 모두 0으로만 구성되어있으면 0 반환
        StringBuilder sb = new StringBuilder();
        result.forEach(sb::append);
        if (sb.chars().allMatch(s -> s == '0')) {
            return "0";
        }
        
        return sb.toString();
    }
}