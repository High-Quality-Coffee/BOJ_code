class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aValue=a+"";
        String bValue=b+"";
        
        String result1=aValue+bValue;
        String result2=bValue+aValue;
        
        answer = (Integer.parseInt(result1)>Integer.parseInt(result2)) ? Integer.parseInt(result1) : Integer.parseInt(result2);
        
        return answer;
    }
}