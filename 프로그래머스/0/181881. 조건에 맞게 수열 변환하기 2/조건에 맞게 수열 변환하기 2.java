import java.util.*;

class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        int[] comp={};
        int count=0;
        
        while(true){
            comp=arr;
            arr=Arrays.stream(arr).map(i->i>=50 && i%2==0 ? i/2 : i<50 && i%2==1 ? i*2+1 :i).toArray();
            count++;
            if(Arrays.equals(arr, comp)) break;
        }
        
        // comp=Arrays.stream(arr).map(i->i>=50 && i%2==0 ? i/2 : i<50 && i%2==1 ? i*2+1 :i).toArray();
        
        return count-1;
    }
}