class Solution {
    public int[] solution(String myString) {
        int[] answer = new int[myString.split("x",-1).length];
        int idx=0;
        
        String[] str = myString.split("x",-1);
        
        for(String s:str){
            answer[idx++]=s.length();
        }
        
        return answer;
    }
}