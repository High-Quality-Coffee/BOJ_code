import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] arr=my_string.toCharArray();
        
        for(int i =0;i<indices.length;i++){
            arr[indices[i]]=' ';
        }
        
        
        answer=String.valueOf(arr); 
        answer = answer.replace(" ","");
        return answer;
    }
}