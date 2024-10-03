class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int idx=0;
        
        while(n>=answer){
            answer+=numbers[idx++];    
        }
        
        return answer;
    }
}