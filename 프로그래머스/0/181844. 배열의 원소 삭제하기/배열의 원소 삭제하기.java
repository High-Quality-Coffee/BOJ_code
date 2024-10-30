import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i:arr) list.add(i);
        
        for(int i:delete_list){
            if(list.contains(i)) list.remove(list.indexOf(i));
        }
        
        return list.stream().mapToInt(i->i).toArray();
        
    }
}