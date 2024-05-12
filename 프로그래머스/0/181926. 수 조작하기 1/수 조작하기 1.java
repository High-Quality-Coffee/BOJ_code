class Solution {
    public int solution(int n, String control) {
        int answer = n;
        char[] arr = control.toCharArray();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='w') answer=answer+1;
            else if(arr[i]=='s') answer=answer-1;
            else if(arr[i]=='d') answer=answer+10;
            else answer=answer-10;
        }
        
        return answer;
    }
}