class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] arr  = number.toCharArray();
        int sum=0;
        
        if(number.length()>=10){
            for(char c : arr){
                sum+=(c-'0');
            }
            answer=sum%9;
        }else{
            answer=Integer.valueOf(number)%9;
        }
        
    
        
        return answer;
    }
}