class Solution {
    public String solution(String code) {
        int mode =0;
        String answer = "";
        
        for(int i=0;i<code.length();i++){
            if(mode==0){
                if(code.charAt(i)=='1') mode=1;
                else {
                    if(i%2==0) answer+=code.charAt(i);
                }
            }
            else{
                if(code.charAt(i)=='1') mode=0;
                else{
                    if(i%2==1) answer+=code.charAt(i);
                }
            }
            
        }
        
        if(answer=="")
            return "EMPTY";
        return answer;
    }
}