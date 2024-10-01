import java.util.Arrays;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer={};
        int lindex=-1;
        int rindex=-1;
        
        for(int i=0;i<str_list.length;i++){
            if(str_list[i].equals("l")) {
                lindex=i;
                break;
            }
            else if(str_list[i].equals("r")){
                rindex=i;
                break;
            }
        }
        
        if(lindex==-1 && rindex==-1) return new String [0];
        if(str_list.length==1) return new String [0];
        
        if(lindex>=0){
            answer = Arrays.copyOf(str_list,lindex);
        }
        else if(rindex>=0){
            answer=Arrays.copyOfRange(str_list,rindex+1,str_list.length);
        }
        
        return answer;
    }
}