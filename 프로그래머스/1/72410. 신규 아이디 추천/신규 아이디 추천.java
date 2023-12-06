class Solution {
    public String solution(String new_id) {
        return isLessThan2(
            isStartEndWithDot(
                isOverThan15(
                    isEmptyStr(
                        isStartEndWithDot(new_id.toLowerCase()
            .replaceAll("[^a-z0-9_.-]", "")
            .replaceAll("[.]{2,1000}", ".")
            )))));
    }
    
    // .가 처음/끝에 있으면 제거
    public String isStartEndWithDot (String str) {
        if(str.startsWith(".")) str = str.substring(1,str.length());
        if(str.endsWith(".")) str = str.substring(0, str.length()-1);
        return str;
    }
    
    // 빈 문자열이면 "a"
    public String isEmptyStr (String str) {
        if("".equals(str)||str==null) return "a";
        else return str;
    }
    
    // 글자수 조절
    public String isOverThan15 (String str) {
        if(str.length()>15) return str.substring(0,15);
        return str;
    }
    
    // 2자 이하면 마지막 문자 추가
    public String isLessThan2 (String str) {
        int len = str.length();
        if(len>2) return str;
        
        String last = str.substring(len-1,len);
        if (len==2) return str+last;
        else return str+last+last; 
    }
}