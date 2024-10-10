class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int idx=-1;
        int last = myString.lastIndexOf(pat);
        
        for(int i=0;i<myString.length();i++){
            if(last==idx) break;
            else idx++;
            idx = myString.indexOf(pat,idx);
            answer++;
        }
       
        return answer;
    }
}