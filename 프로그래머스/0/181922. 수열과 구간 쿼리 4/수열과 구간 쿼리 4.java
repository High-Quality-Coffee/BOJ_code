class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i=0; i<queries.length;i++){
            multi(arr, queries[i][0], queries[i][1],queries[i][2]);
        }
        return arr;
    }
    public void multi(int[] arr,int i, int j, int k){
        for(int a=i;a<=j;a++){
            if(a%k==0) arr[a]+=1;
        }
    }
}