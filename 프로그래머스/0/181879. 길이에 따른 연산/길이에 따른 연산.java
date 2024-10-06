class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int mul=1;
        
        if(num_list.length>=11){
            for(int i:num_list){
                answer+=i;
            }
        }
        else if(num_list.length<=10){
            for(int i:num_list){
                mul*=i;
            }
            answer=mul;
        }
        
        return answer;
    }
}