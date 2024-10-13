class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        char[] list = myString.toCharArray();
        
        for(int i=0;i<list.length;i++){
            if(list[i]=='A') list[i]='B';
            else list[i]='A';
        }
        
        String str=String.valueOf(list);
        if(str.indexOf(pat)>=0) return 1;
        else return 0;
    
    }
}