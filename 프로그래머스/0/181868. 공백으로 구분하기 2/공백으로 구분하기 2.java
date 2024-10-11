import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = Arrays.stream(my_string.split(" "))
            .filter(i->!i.equals(""))
            .toArray(String[]::new);
        return answer;
    }
}