class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==' ') answer+=s.charAt(i);
            else if(s.charAt(i)+n > 'z' && s.charAt(i)>='a' && s.charAt(i)<='z') answer+=(char) ('a'+(s.charAt(i)+n)%'z'-1);
            else if(s.charAt(i)+n>'Z' && s.charAt(i)>='A' && s.charAt(i)<='Z') answer+=(char) ('A'+(s.charAt(i)+n)%'Z'-1);
            else answer+=(char) (s.charAt(i)+n);
        }
        
        return answer;
    }
}