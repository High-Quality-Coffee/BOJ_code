class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {        
        int findex=arr1.length;
        int lindex=arr2[0].length;
        int idx=0;
        int sum=0;
        int rindex=0;
        
        int[][] answer = new int[findex][lindex];
        
        while(idx<findex){
            for(int i=0;i<arr1[idx].length;i++){
                sum+=arr1[idx][i]*arr2[i][rindex];
            }
            answer[idx][rindex]=sum;
            sum=0;
            rindex++;
            if(rindex>=lindex) {
                idx++;
                rindex=0;
            }
        }
        
        return answer;
    }
}