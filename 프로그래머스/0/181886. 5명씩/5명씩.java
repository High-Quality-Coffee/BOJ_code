class Solution {
    public String[] solution(String[] names) {
        
        int size=0;
        int idx=0;
        
        if(names.length%5==0){
            size=names.length/5;
        }
        else size=names.length/5 + 1;
        
        String[] answer = new String[size];
        
        for(int i=0;i<names.length;i++){
            if(i%5==0) answer[idx++] = names[i];
        }
        
        return answer;
    }
}