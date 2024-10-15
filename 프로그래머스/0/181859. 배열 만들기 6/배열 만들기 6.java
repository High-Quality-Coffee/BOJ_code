import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        ArrayList <Integer> list = new ArrayList<Integer>();
        
        for(int i=0;i<arr.length;i++){
            if(list.size()==0) {
                list.add(arr[i]);
                continue;
            }
            else if(list.size()>0 && list.get(list.size()-1)==arr[i]){
                list.remove(list.size()-1);
            }
            else{
                list.add(arr[i]);
            }
            
        }
        
        if(list.size()==0) return new int[] {-1};
        
        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        
    }
}