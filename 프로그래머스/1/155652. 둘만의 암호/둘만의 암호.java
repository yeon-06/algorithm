import java.util.stream.IntStream;

class Solution {
    
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        for(char alpha:new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'}) {
            if (skip.chars().noneMatch(it -> it == alpha)) {
                sb.append(alpha);
            }
        }
        String alphas = sb.toString();
        int length = sb.length();
        
        return s.chars()
            .map(c -> change(alphas, length, alphas.indexOf(c) + index))
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();
    }
    
    private char change(String alphas, int length, int value) {
        int result = value;
        while (result >= length) {
            result -= length;
        }
        return alphas.charAt(result);
    }
}