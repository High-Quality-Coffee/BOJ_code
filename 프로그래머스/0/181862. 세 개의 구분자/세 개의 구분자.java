import java.util.Arrays;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        
        answer = myStr.replace("a","!").replace("b","!").replace("c","!").split("!");
        answer=Arrays.stream(answer).filter(i->!i.equals(""))
            .toArray(String[]::new);
        if(answer.length==0) return new String[] {"EMPTY"};
        else return answer;
    }
}