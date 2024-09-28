class Solution {
    public int[] solution(int[] num_list, int n) {
        int last = num_list.length-1;
        int[] answer = new int[last-n+2];
        
        for(int i=n-1;i<=last;i++){
            answer[i-n+1] = num_list[i];
        }
        
        return answer;
    }
}