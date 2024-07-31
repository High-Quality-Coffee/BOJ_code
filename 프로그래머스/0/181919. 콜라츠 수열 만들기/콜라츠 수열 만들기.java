class Solution {
    public int[] solution(int n) {
        int count=0;
        int x=n;
        int j=n;
        int index=0;
        
        while(x!=1){
            if(x%2==0){
                count++;
                x=x/2;
            }
            else{
                count++;
                x=(3*x)+1;
            }
        }
        
        int[] answer = new int[count+1];
        
        
        while(j!=1){
            if(j%2==0 && j!=1){
                answer[index]=j;
                j=j/2;
                index++;
                if(j==1) answer[index]=1;
            }
            else if(j%2!=0 && j!=1){
                answer[index]=j;
                j=(3*j)+1;
                index++;
                if(j==1) answer[index]=1;
            }
        }
        return answer;
    }
}