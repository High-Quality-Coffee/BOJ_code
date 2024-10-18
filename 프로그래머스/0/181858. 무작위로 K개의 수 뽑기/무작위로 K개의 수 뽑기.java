//서로 다른 => 중복이 되지 않는,,
//set or stream으로 접근하기 가능
import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        
        Set <Integer> set  = new LinkedHashSet<Integer>();
        for(int e:arr) set.add(e);
        
        List <Integer> newList = new ArrayList <Integer>(set);
        
        if(newList.size()==k) return newList.stream().mapToInt(i->i).toArray();
        else if(newList.size()<k){
            while(newList.size()<k) newList.add(-1);
        }
        else{
            newList=newList.subList(0,k);
        }
        return newList.stream().mapToInt(i->i).toArray();        

    }
}