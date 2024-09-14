import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(int n, int k) {
        int[] answer = {};
        
        ArrayList<Integer> arr = new ArrayList<>();
        
        
        for(int i = 1;i<=n;i++){
            if(i%k==0)
                arr.add(i);
        }
        
        return arr;
    }
}