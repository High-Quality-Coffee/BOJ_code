class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        int index[] = new int[code.length()];
        for(int i=0;i<code.length();i++){
            index[i]=i%q;
            if(index[i]==r){
                answer+=code.charAt(i);
            }
        }
        
        
        
        return answer;
    }
}