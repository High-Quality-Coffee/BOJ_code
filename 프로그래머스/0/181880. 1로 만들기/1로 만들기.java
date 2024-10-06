import java.util.*;

class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int[] list = new int[num_list.length];
        int idx=0;
        
        for(int i:num_list){
            answer+=count(i);
        }
                
        return answer;
    }
    
    public int count(int value){
        int cnt=0;
        
        while(value!=1){
            if(value%2==0) {value=value/2; cnt++;}
            else {value=(value-1)/2; cnt++;}
        }
        
        return cnt;
        
    }
}