class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String deleteword=my_string.substring(s,s+overwrite_string.length());
        StringBuilder sb=new StringBuilder(my_string);
        sb.delete(s, s+overwrite_string.length());
        sb.insert(s, overwrite_string);
        answer=sb.toString();
        
       
        return answer;
    }
}