import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {        
        String[] answer= myString.split("x");
        
        answer=Arrays.stream(answer).filter(i->!i.equals(""))
            .toArray(String[]::new);
        
        Arrays.sort(answer);
    
        
        return answer;
    }
}