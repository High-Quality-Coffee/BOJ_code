class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0;i< numLog.length-1;i++){
            if(numLog[i+1]-numLog[i]==1) answer.append('w');
            else if(numLog[i+1]-numLog[i]==-1) answer.append('s');
            else if(numLog[i+1]-numLog[i]==10) answer.append('d');
            else answer.append('a');
        }
        String a=String.valueOf(answer);
        return a;
    }
}