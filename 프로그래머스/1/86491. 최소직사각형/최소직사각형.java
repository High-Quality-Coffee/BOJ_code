import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int max = 0;
        int maxIdx = 0;
        int maxt = 0;
        
        //최대값 찾기
        for(int i=0; i<sizes.length;i++){
            Arrays.sort(sizes[i]);
            if(max < sizes[i][1]){
                max = sizes[i][1];
                maxt=sizes[i][0];
                maxIdx = i;
            }
        }
        
        for(int i=0;i<sizes.length;i++){
            if(i==maxIdx) continue;
            
            if((sizes[i][0] <= max && sizes[i][1] <= maxt) || (sizes[i][0] <= maxt && sizes[i][1] <=max)){
                continue;
            }
            
            Arrays.sort(sizes[i]);
            maxt = sizes[i][0];
        }
        
        answer = maxt*max;
        
        return answer;
    }
}