class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
    
        for(int i=0; i<queries.length; i++){
           answer[i]=check(arr, queries[i][0],queries[i][1],queries[i][2]);
        }
        return answer;
    }
    
    public int check(int[] arr, int i,int j, int k){
        int min=1000001;
        for(int a=i;a<=j;a++){
            if(arr[a]>k && arr[a]<min) min=arr[a];
        }
        if(min==1000001) return -1;
        return min;
    }
}