class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String pre,post,mid;
        
        mid = my_string.substring(s,e+1);
        pre=my_string.substring(0,s);
        post=my_string.substring(e+1);
        
        StringBuilder str = new StringBuilder(mid);
        mid = str.reverse().toString();
        
        answer = pre + mid + post;
        return answer;
    }
}