import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        int[] answer = {};
        int idx=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        while(idx<arr.length){
            if(flag[idx]){
                for(int i=0;i<arr[idx]*2;i++){
                    list.add(arr[idx]);    
                }
            }
            else if(!flag[idx]){
                for(int i=0;i<arr[idx];i++){
                    list.remove(list.size()-1);
                }
            }
            idx++;
        }        
        return list.stream()
            .mapToInt(Integer::intValue)
            .toArray();
    }
}