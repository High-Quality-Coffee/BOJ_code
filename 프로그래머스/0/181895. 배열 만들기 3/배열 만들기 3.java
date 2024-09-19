class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int size1 = (intervals[0][1]-intervals[0][0]+1);
        int size2= (intervals[1][1]-intervals[1][0]+1);
        int allsize = size1 + size2;
        
        int[] answer = new int[allsize];
        int idx=0;
        
        for(int i=intervals[0][0];i<=intervals[0][1];i++){
            answer[idx]=arr[i];
            idx++;
        }
        
        for(int j=intervals[1][0];j<=intervals[1][1];j++){
            answer[idx]=arr[j];
            idx++;
        }
        
        return answer;
    }
}