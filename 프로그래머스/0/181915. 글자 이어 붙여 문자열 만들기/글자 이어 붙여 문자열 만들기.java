class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        StringBuilder sent = new StringBuilder();
        
        for(int i=0;i<index_list.length;i++){
            sent.append(my_string.charAt(index_list[i]));
        }
        answer = sent.toString();
        return answer;
    }
}