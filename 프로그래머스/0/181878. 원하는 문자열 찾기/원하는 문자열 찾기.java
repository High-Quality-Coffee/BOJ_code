class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        myString=myString.toLowerCase();
        pat=pat.toLowerCase();
        if(myString.indexOf(pat)>=0) return 1;
        else return 0;
        // return answer;
    }
}