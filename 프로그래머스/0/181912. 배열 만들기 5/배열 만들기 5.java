import java.util.ArrayList;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList <Integer> arr = new ArrayList<Integer>();
        
        int idx=0;
        
        for(int i=0;i<intStrs.length;i++){
            if(k<Integer.parseInt(intStrs[i].substring(s,s+l))){
                int num = Integer.parseInt(intStrs[i].substring(s,s+l));
                arr.add(num);
            }
        }
        
        int [] answer = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            answer[i]=arr.get(i);
        }
        return answer;
    }
}
