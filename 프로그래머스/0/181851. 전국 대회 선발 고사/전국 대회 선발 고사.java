import java.util.*;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int[] rankcpy = new int[rank.length];
        int[] list = new int[3];
        int idx=0;
        
        for(int i=0;i<rank.length;i++){
            rankcpy[i]=rank[i];
        }
        Arrays.sort(rankcpy);
        
        ArrayList <Integer> arr = new ArrayList<>();
        for(int i:rank){
            arr.add(i);
        }
        
        for(int i=0;i<rankcpy.length;i++){
            if(attendance[arr.indexOf(rankcpy[i])]){
                list[idx++]=arr.indexOf(rankcpy[i]);
                if(idx==3) break;
            }
            else continue;
        }
        
        return (10000*list[0] + 100*list[1] + list[2]);
    }
}