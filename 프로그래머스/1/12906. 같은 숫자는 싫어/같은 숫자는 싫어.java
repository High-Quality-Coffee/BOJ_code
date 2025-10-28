import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        List<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        int lidx = 0;
        
        for(int i=1;i<arr.length;i++){
            if(answer.get(lidx)==arr[i]){
                continue;
            }
            answer.add(arr[i]);
            lidx++;
        }
        
        int[] answers = new int[answer.size()];
        int idx = 0;
        
        for(int i : answer){
            answers[idx] = i;
            idx++;
        }

        return answers;
    }
}