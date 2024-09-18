import java.util.List;
import java.util.ArrayList;

class Solution {
    public List solution(int n, int[] slicer, int[] num_list) {
        ArrayList <Integer> answer = new ArrayList<Integer>();
        
        switch(n){
            case 1:for(int i=0;i<=slicer[1];i++){
                answer.add(num_list[i]);
            }
                break;
            case 2:for(int i=slicer[0];i<num_list.length;i++){
                answer.add(num_list[i]);
            }
                    break;
            case 3:for(int i=slicer[0];i<=slicer[1];i++){
                answer.add(num_list[i]);
            }
                break;
            case 4:for(int i=slicer[0];i<=slicer[1];i=i+slicer[2]){
                answer.add(num_list[i]);
            }
                break;
        }
        
        
        
        return answer;
    }
}