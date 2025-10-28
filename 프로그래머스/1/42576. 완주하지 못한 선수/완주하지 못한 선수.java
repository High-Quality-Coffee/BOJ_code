import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        HashMap<String, Integer> parMap = new HashMap<String, Integer>();
        
        for(int i=0;i<completion.length;i++){
            hashMap.put(completion[i], hashMap.getOrDefault(completion[i], 0)+1);
        }
        
        for(int i=0;i<participant.length;i++){
            if(!hashMap.containsKey(participant[i])){
                answer = participant[i];
                break;
            }
            
            parMap.put(participant[i], parMap.getOrDefault(participant[i], 0)+1);
            
            
            if(hashMap.get(participant[i])<parMap.get(participant[i])){
                answer = participant[i];
                break;
            }
        }
        
        return answer;
    }
}