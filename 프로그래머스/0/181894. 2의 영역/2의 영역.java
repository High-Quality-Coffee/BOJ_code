import java.util.*;

class Solution {
    public ArrayList <Integer> solution(int[] arr) {
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Integer> newlist = new ArrayList<>();
        ArrayList <Integer> errorlist = new ArrayList<>(Arrays.asList(-1));
        
        int count_two=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2) count_two++;
            list.add(arr[i]);
        }
        
        if(count_two==0) {
            return errorlist;
        }
        
        int first= list.indexOf(2);
        int last = list.lastIndexOf(2);
        
        for(int i=first;i<=last;i++){
            newlist.add(list.get(i));
        }
        
        return newlist;
    }
}