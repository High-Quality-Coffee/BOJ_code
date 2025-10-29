import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();;
        
        for(int[] arr : commands){
            List<Integer> list = new ArrayList<>();
            
            for(int i = arr[0]-1; i<arr[1]; i++){
                list.add(array[i]);
            }
            
            Collections.sort(list);
            answer.add(list.get(arr[2]-1));
        }
        
        int[] answerArray = new int[answer.size()];
        
        for(int i=0;i<answer.size();i++){
            answerArray[i] = answer.get(i);
        }
        return answerArray;
    }
}