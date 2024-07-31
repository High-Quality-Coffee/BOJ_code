import java.util.ArrayList;

class Solution {
    public ArrayList <Integer> solution(int[] arr) {
        int[] stk = {};
        int i=0;
        ArrayList <Integer> list= new ArrayList<Integer> ();
        
        while(i<arr.length){
            if(list.size()==0) {
                list.add(arr[i]);
                i++;
            }
            else if(list.size()!=0 && list.get(list.size()-1)<arr[i]){
                list.add(arr[i]);
                i++;
            }
            else if(list.size()!=0 && list.get(list.size()-1)>=arr[i]){
                list.remove(list.size()-1);
            }
            
        }
        
        return list;
    }
}