class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        int idx=0;
        
        for(String s:strArr){
            if(idx%2==1) answer[idx++] = s.toUpperCase();
            else answer[idx++]=s.toLowerCase();
        }
        
        return answer;
    }
}