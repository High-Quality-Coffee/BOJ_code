import java.util.*;

class Solution {
    public static int compare(int[] one, int[] two){
        if(one.length>two.length){
            return 1;
        }
        else if(one.length<two.length){
            return -1;
        }
        
        if(Arrays.stream(one).sum()>Arrays.stream(two).sum()) return 1;
        else if(Arrays.stream(one).sum()<Arrays.stream(two).sum()) return -1;
        else return 0;
        
    }
    
    public int solution(int[] arr1, int[] arr2) {
        return compare(arr1,arr2);
    }
}