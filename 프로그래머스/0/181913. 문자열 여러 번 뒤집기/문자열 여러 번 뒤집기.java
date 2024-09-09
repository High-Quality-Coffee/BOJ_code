class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        char[] arr = my_string.toCharArray();
        char[] originArr=my_string.toCharArray();
        
        for(int i=0;i<queries.length;i++){
            int idx=0;
            for(int j=queries[i][0];j<=queries[i][1];j++){
                arr[j]=originArr[queries[i][1]-idx];
                idx++;
            }            
            for (int k = 0; k < arr.length; k++) {
                originArr[k] = arr[k];
            }
        }
        
        String str = String.valueOf(arr);
        return str;
    }
}