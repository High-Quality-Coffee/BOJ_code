class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        char matrix[][] = new char[my_string.length()/m][m];
        int idx=0;
        
        for(int i=0;i<my_string.length()/m;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=my_string.charAt(idx);
                idx++;
            }
        }
        
        for(int i=0;i<my_string.length()/m;i++){
            answer+=String.valueOf(matrix[i][c-1]);
        }
        
        return answer;
    }
}