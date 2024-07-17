class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        for(int i=0;i<queries.length;i++){
            swap(arr, queries[i][0],queries[i][1]);
        }
        
        return arr;
    }
    
    public void swap(int[] arr, int a,int b){
        int temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}