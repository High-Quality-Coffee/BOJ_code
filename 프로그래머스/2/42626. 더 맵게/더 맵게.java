import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> q = new PriorityQueue<>();
        
        for(int i : scoville){
            q.add(i);
        }
        
        int firstNotSpicy=0;
        int secondNotSpicy=0;
        int mixedSpicy = 0;
        
        while(q.peek() < K && q.size() >= 2){
            firstNotSpicy = q.poll();
            secondNotSpicy = q.poll();
                        
            mixedSpicy = firstNotSpicy + (secondNotSpicy*2);
            
            q.add(mixedSpicy);
            
            answer++;
        }
        
        if(q.peek()<K) return -1;
        
        return answer;
    }
    
    
}