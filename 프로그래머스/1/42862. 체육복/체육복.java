import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        boolean[] lost_visited = new boolean[lost.length];
        boolean[] reserve_visited = new boolean[reserve.length];
        
        for(int i=0;i<lost.length;i++){
            lost_visited[i]=false;
        }
        
         for(int i=0;i<reserve.length;i++){
            reserve_visited[i] = false;
        }
        
        int studentNow = 0;
        int reserveValue = 0;
        int lostValue=0;
        int testValue = 0;
        
        //현재 학생 수
        studentNow = n-lost.length;
        
        int r_value = 0;
        int l_value=0;
        
        //여벌 체육복이 있는 애들이 도난 당하면 못빌려줌
        //reserve에 있는 애들은 lost 애들한테 못빌려줌
        for(int r=0; r<reserve.length;r++){
            r_value = reserve[r];
            for(int l=0;l<lost.length;l++){
                l_value = lost[l];
                if(r_value==l_value){
                    lost_visited[l]=true;
                    reserve_visited[r]=true;
                    studentNow+=1;
                    break;
                }
            }
            
        }
        
        for(int i=0; i<reserve.length;i++){
            if(reserve_visited[i]) continue;
            
            reserveValue = reserve[i];
            
            for(int j=0;j<lost.length;j++){
                if(lost_visited[j]) continue;
                
                lostValue = lost[j];
                if(lostValue == (reserveValue+1) || lostValue == (reserveValue-1) ){
                    lost_visited[j]=true;
                    reserve_visited[i]=true;
                    studentNow+=1;
                    break;
                }
            }
            
        }
        
        
    
        
        return studentNow;
    }
    
}